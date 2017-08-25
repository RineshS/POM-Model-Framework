package base;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WdEventListenerCalls implements WebDriverEventListener{

	@Override
	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("The alert accept is clicked successfully");
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("The alert dismiss is clicked successfully");
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		System.out.println("The element"+element+ "value as"+keysToSend);
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("The element"+element+"is clicked successfully");
		
	}

	@Override
	public void afterFindBy(By ele, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("The"+ele+"with the"+element+"found successfully");
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("The navigate back is done successfully");
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("The navigate back is done successfully");
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("The navigate back is done successfully");
		
	}

	@Override
	public void afterNavigateTo(String URL, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("The browser"+driver+"launched with url"+URL);
		
	}

	@Override
	public void afterScript(String value, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println(" After script is done");
		
	}

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before alert accept is done");
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before alert dismiss is done");
		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("Before Change valueof is done");
		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before click on is done");
		
	}

	@Override
	public void beforeFindBy(By ele, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before find by is done");
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before navigate back is done");
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before navigate forward is done");
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before navigate refresh is done");
		
	}

	@Override
	public void beforeNavigateTo(String URL, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("The browser"+driver+"launched with url"+URL);
		
	}

	@Override
	public void beforeScript(String value, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before script is done");
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		String expMsg =  throwable.getMessage();
		String[] splitMsg = expMsg.split("Element info:"); 
		if(throwable instanceof NoSuchElementException){
			//System.out.println(expMsg);// Prints full error message
			System.out.println("The Element"+splitMsg[1]+ "is not found");//only the required info in error message
			//System.out.println("The element could not be found:"+throwable.getMessage());;// Prints full error message
		}else if(throwable instanceof NoSuchWindowException){
			System.out.println("The window could not be found:"+throwable.getMessage());;
		}else if(throwable instanceof InvalidSelectorException){
			System.out.println("The Xpath is wrong:"+throwable.getMessage());
		}else if(throwable instanceof NoAlertPresentException){
			System.out.println("The alert could not be found:"+throwable.getMessage());
		}else if(throwable instanceof NoSuchFrameException){
			System.out.println("The frame could not be found:"+throwable.getMessage());
		}else if(throwable instanceof ElementNotSelectableException){
			System.out.println("The element is not selectable:"+throwable.getMessage());
		}else if(throwable instanceof ElementNotVisibleException){
				System.out.println("The element is not visible:"+throwable.getMessage());
		}else if(throwable instanceof TimeoutException){
			System.out.println("The value"+throwable.getMessage()+"is not loaded");
		}
		throw new RuntimeException();
	
}
}
