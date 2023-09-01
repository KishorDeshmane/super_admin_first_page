package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_service_area_management_page_objects {
	public WebDriver driver;

	@FindBy(xpath = "//*[@class='page-header']/div/h2")
	private WebElement service_area_management_title_text;
	
	@FindBy(xpath="//*[text()='Create Service Area']")
	private WebElement create_service_area_button;
	
	@FindBy(xpath= "//*[@class='dropdown']/button/i")
	private WebElement first_user_kebab_menu;
	
	@FindBy(xpath= "//*[@class='dropdown-item'][1]/a")
	private WebElement first_user_kebab_menu_edit_button;
	
	@FindBy(xpath= "//*[@class='dropdown-item'][2]/a")
	private WebElement first_user_kebab_menu_change_status_buttton;
	
	@FindBy(xpath= "//*[@class='dropdown-item'][3]/a")
	private WebElement first_user_kebab_menu_delete_button;
	

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public Lookups_service_area_management_page_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public boolean user_service_area_management_title_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, service_area_management_title_text);
		return service_area_management_title_text.isDisplayed();
	}

	public boolean user_create_service_category_button_should_be_clickable(){
		return create_service_area_button.isEnabled();
	}
	
	public void user_create_service_area_button_is_click(){
		create_service_area_button.click();
	}
	
	public void user_kebab_menu_is_clicked() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, first_user_kebab_menu);
		first_user_kebab_menu.click();
	}
	
	public void user_kebab_menu_edit_is_clicked() {
		first_user_kebab_menu_edit_button.click();
	}
	
	public void user_first_user_kebab_menu_change_status_buttton_is_clicked(){
		first_user_kebab_menu_change_status_buttton.click();
	}
	
	public void user_kebab_menu_delete_is_clicked() {
		first_user_kebab_menu_delete_button.click();
	}
	
}
