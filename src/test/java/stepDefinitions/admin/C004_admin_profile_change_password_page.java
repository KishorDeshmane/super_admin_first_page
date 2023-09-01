//package stepDefinitions.admin;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.junit.Assert;
//
//import com.applicationHooks.AppHooks;
//import com.pages.Landing_page_objects;
//import com.pages.admin.C001_admin_log_in_page_objects;
//import com.pages.admin.C002_admin_dashboard_main_page_objects;
//import com.pages.admin.C004_admin_profile_change_password_page_objects;
//import com.qa.factory.DriverFactory;
//import com.qa.utility.ElementUtil;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class C004_admin_profile_change_password_page {
//
//	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
//	private C001_admin_log_in_page_objects adlogin = new C001_admin_log_in_page_objects(DriverFactory.getDriver());
//	private C002_admin_dashboard_main_page_objects admain = new C002_admin_dashboard_main_page_objects(DriverFactory.getDriver());
//	private C004_admin_profile_change_password_page_objects adcp = new C004_admin_profile_change_password_page_objects(DriverFactory.getDriver());
//	Logger logger = LogManager.getLogger(C004_admin_profile_change_password_page.class);
//	
//    
//    /*
//     * 
//     * 
//     * 
//     * 
//     * 
//     * 
//     * 
//     * 
//     * 
//     * 
//     * SCR Change password
//     * 
//     * 
//     * 
//     * 
//     * 
//     * 
//     * 
//     * 
//     * 
//     */
//
//    
//    @Given("Verify that user is on the admin dashboard change password page as expected page title {string}")
//    public void verify_that_user_is_on_the_admin_dashboard_change_password_page_as_expected_page_title(String title) {
//    	DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
//		lp.user_log_in_to_admin_page();
//		adlogin.admin_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("admin_email"));
//		adlogin.admin_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("admin_password"));
//		adlogin.admin_sign_in_button_is_clicked();
//		admain.admin_logger_first_profile_dropdown_button_is_clicked();
//		admain.admin_logger_profile_dropdown_change_password_is_clicked();
//		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
//		Assert.assertEquals(actual, title);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page header change password title text is displayed from admin dashboard change password page")
//    public void verify_that_page_header_change_password_title_text_is_displayed_from_admin_dashboard_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_header_change_password_title_text_is_displayed();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    
//    @Then("Verify that page breadcrum list should be displayed from the admin dashboard change password page")
//    public void verify_that_page_breadcrum_list_should_be_displayed_from_the_admin_dashboard_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_breadcrum_list_is_displayed();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page breadcrum dashborad button should be clickable from the admin dashboard change password page")
//    public void verify_that_page_breadcrum_dashborad_button_should_be_clickable_from_the_admin_dashboard_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_breadcrum_dashborad_button_is_clickable();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page breadcrum change password text is displayed from the admin dashboard change password page")
//    public void verify_that_page_breadcrum_change_password_text_is_displayed_from_the_admin_dashboard_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_breadcrum_change_password_text_is_displayed();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page current password title text above userfield should be displayed from the admin change password page")
//    public void verify_that_page_current_password_title_text_above_userfield_should_be_displayed_from_the_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_current_password_title_text_above_userfield_is_displayed();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page current password user field should be clickable from the admin change password page")
//    public void verify_that_page_current_password_user_field_should_be_clickable_from_the_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_current_password_user_field_is_clickable();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page current password user field placeholder value should be {string} from the admin change password page")
//    public void verify_that_page_current_password_user_field_placeholder_value_should_be_from_the_admin_change_password_page(String string) {
//    	String actual=adcp.admin_logger_change_password_page_current_password_user_field_placeholder_value();
//        Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page submit button should be displayed from the admin change password page")
//    public void verify_that_page_submit_button_should_be_displayed_from_the_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_submit_button_is_displayed();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page submit button should be clickable from the admin change password page")
//    public void verify_that_page_submit_button_should_be_clickable_from_the_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_submit_button_is_clickable();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page cancel button should be displayed from the admin change password page")
//    public void verify_that_page_cancel_button_should_be_displayed_from_the_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_cancel_button_is_displayed();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page cancel button should be clickable from the admin change password page")
//    public void verify_that_page_cancel_button_should_be_clickable_from_the_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_cancel_button_is_clickable();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page submit button should be able to mouse hover from admin change password page")
//    public void verify_that_page_submit_button_should_be_able_to_mouse_hover_from_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_submit_button_should_be_able_to_mouse_hover();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page cancel button should be able to mouse hover from admin change password page")
//    public void verify_that_page_cancel_button_should_be_able_to_mouse_hover_from_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_cancel_button_should_be_able_to_mouse_hover();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page new password title text is displayed in the change password second page from admin change password page")
//    public void verify_that_page_new_password_title_text_is_displayed_in_the_change_password_second_page_from_admin_change_password_page() {
//    	adcp.admin_logger_change_password_page_current_password_user_field_send_text(AppHooks.prop.getProperty("admin_password"));
//        adcp.admin_logger_change_password_page_submit_button_is_clicked();
//        boolean actual=adcp.admin_logger_change_password_page_new_password_title_text_is_displayed();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
////    @Then("Verify that page new password title text is displayed in the change password second page from admin change password page")
////    public void verify_that_page_new_password_title_text_is_displayed_in_the_change_password_second_page_from_admin_change_password_page() {
////        adprof.admin_logger_change_password_page_current_password_user_field_send_text(AppHooks.prop.getProperty("admin_password"));
////        adprof.admin_logger_change_password_page_submit_button_is_clicked();
////        boolean actual=adprof.admin_logger_change_password_page_new_password_title_text_is_displayed();
////        Assert.assertEquals(actual, true);
////		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
////		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
////	}
//    
//    @Then("Verify that page new password userfield should be clickable in the change password second page from admin change password page")
//    public void verify_that_page_new_password_userfield_should_be_clickable_in_the_change_password_second_page_from_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_new_password_userfield_is_clickable();
//        Assert.assertEquals(actual, true);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page comfirm password title text is displayed in the change password second page from admin change password page")
//    public void verify_that_page_comfirm_password_title_text_is_displayed_in_the_change_password_second_page_from_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_comfirm_password_title_text_is_displayed();
//        Assert.assertEquals(actual, true);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page new password userfield placeholder value should be {string} in the change password second page from admin change password page")
//    public void verify_that_page_new_password_userfield_placeholder_value_should_be_in_the_change_password_second_page_from_admin_change_password_page(String string) {
//        String value = adcp.admin_logger_change_password_page_new_password_userfield_is_placeholder();
//        Assert.assertEquals(value, string);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page comfirm password userfield placeholder value should be {string} in the change password second page from admin change password page")
//    public void verify_that_page_comfirm_password_userfield_placeholder_value_should_be_in_the_change_password_second_page_from_admin_change_password_page(String string) {
//        String value = adcp.admin_logger_change_password_page_comfirm_password_userfield_is_placeholder();
//        Assert.assertEquals(value, string);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page comfirm password userfield should be clickable in the change password second page from admin change password page")
//    public void verify_that_page_comfirm_password_userfield_should_be_clickable_in_the_change_password_second_page_from_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_comfirm_password_userfield_is_clickable();
//        Assert.assertEquals(actual, true);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page submit button should be displayed from the admin change password second page")
//    public void verify_that_page_submit_button_should_be_displayed_from_the_admin_change_password_second_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_submit_button_is_displayed();
//        Assert.assertEquals(actual, true);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page submit button should be clickable from the admin change password second page")
//    public void verify_that_page_submit_button_should_be_clickable_from_the_admin_change_password_second_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_submit_button_is_clickable();
//        Assert.assertEquals(actual, true);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page cancel button should be displayed from the admin change password second page")
//    public void verify_that_page_cancel_button_should_be_displayed_from_the_admin_change_password_second_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_cancel_button_is_displayed();
//        Assert.assertEquals(actual, true);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page cancel button should be clickable from the admin change password second page")
//    public void verify_that_page_cancel_button_should_be_clickable_from_the_admin_change_password_second_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_cancel_button_is_clickable();
//        Assert.assertEquals(actual, true);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page submit button should be able to mouse hover from admin change password secon page")
//    public void verify_that_page_submit_button_should_be_able_to_mouse_hover_from_admin_change_password_secon_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_submit_button_should_be_able_to_mouse_hover();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page cancel button should be able to mouse hover from admin change password second page")
//    public void verify_that_page_cancel_button_should_be_able_to_mouse_hover_from_admin_change_password_second_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_cancel_button_should_be_able_to_mouse_hover();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//    /*
//     * 
//     * 
//     * 
//     * 
//     * Change password work
//     * 
//     * 
//     * 
//     */
//    
//    @Then("user enter the invalid password into the password userfield into the admin dashboard user profile change password page {string}")
//    public void user_enter_the_invalid_password_into_the_password_userfield_into_the_admin_dashboard_user_profile_change_password_page(String string) {
//    	adcp.admin_logger_change_password_page_current_password_user_field_send_text(string);
//    	adcp.admin_logger_change_password_page_submit_button_is_clicked();
//        boolean value = adcp.admin_logger_change_password_page_current_password_user_field_invalid_entered_value();
//        Assert.assertEquals(value, true);
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//    
//    @When("user enter the valid password into the password userfield into the admin dashboard user profile change password page")
//    public void user_enter_the_valid_password_into_the_password_userfield_into_the_admin_dashboard_user_profile_change_password_page() {
//    	adcp.admin_logger_change_password_page_current_password_user_field_send_text(AppHooks.prop.getProperty("admin_password"));
//        String value = adcp.admin_logger_change_password_page_current_password_user_field_value();
//        Assert.assertEquals(value, AppHooks.prop.getProperty("admin_password"));
//        adcp.admin_logger_change_password_page_submit_button_is_clicked();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("open the new password field and comfirm password userfield should be displayed in the admin dashbaord user profile change password page")
//    public void open_the_new_password_field_and_comfirm_password_userfield_should_be_displayed_in_the_admin_dashbaord_user_profile_change_password_page() {
//        boolean actual = adcp.admin_logger_change_password_page_comfirm_password_title_text_is_displayed();
//        boolean act = adcp.admin_logger_change_password_page_new_password_title_text_is_displayed();
//        Assert.assertEquals(actual, act);
//        logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    
//    @When("user enter the new password as {string} and same for the comfirm password into the userfields from admin user profile change password page")
//    public void user_enter_the_new_password_as_and_same_for_the_comfirm_password_into_the_userfields_from_admin_user_profile_change_password_page(String string) {
//    	adcp.admin_logger_change_password_page_new_password_userfield_is_sendText(string);
//        adcp.admin_logger_change_password_page_comfirm_password_userfield_is_sendText(string);
//        String value  = adcp.admin_logger_change_password_page_new_password_user_field_value();
//        String value2  = adcp.admin_logger_change_password_page_comfirm_password_user_field_value();
//        Assert.assertEquals(value, value2);
//        logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that user is on the admin log in page as expected sign in button is displayed in admin log in page")
//    public void verify_that_user_is_on_the_admin_log_in_page_as_expected_sign_in_button_is_displayed_in_admin_log_in_page() {
//    	adcp.admin_logger_change_password_page_submit_button_is_clicked();
//    	boolean actual = adlogin.admin_log_in_page_have_subtitle_signin_to_manage_your_bussiness_is_displayed();
//        Assert.assertEquals(actual, true);
//        logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
// 
//    
//    @Then("Verify that user is not able to log in with thoes old credentials into the admin dashboard log in page")
//    public void verify_that_user_is_not_able_to_log_in_with_thoes_old_credentials_into_the_admin_dashboard_log_in_page() {
//        adlogin.admin_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("admin_email"));
//        adlogin.admin_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("admin_password"));
//        adlogin.admin_sign_in_button_is_clicked();
//        
//        try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//        
//        adlogin.admin_sign_in_button_is_clicked();
//        
//    	boolean actual = adlogin.admin_log_in_note_contaiing_invalid_credentials_is_displayed();
//    	Assert.assertEquals(actual, true);
//        logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that user is able to log in with thoes changed credentials {string} into the admin dashboard log in page")
//    public void verify_that_user_is_able_to_log_in_with_thoes_changed_credentials_into_the_admin_dashboard_log_in_page(String password) {
//        ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//    	adlogin.admin_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("admin_email"));
//        adlogin.admin_log_enter_password_into_the_user_field(password);
//        adlogin.admin_sign_in_button_is_clicked();
//        boolean actual = admain.admin_logger_profile_dropdown_button_is_displayed();
//    	Assert.assertEquals(actual, true);
//        logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//  
//    @Then("Verify that user set the old password {string} in to the admin user profile change password page")
//    public void verify_that_user_set_the_old_password_in_to_the_admin_user_profile_change_password_page(String password) {
//        admain.admin_logger_first_profile_dropdown_button_is_clicked();
//        admain.admin_logger_profile_dropdown_change_password_is_clicked();
//        adcp.admin_logger_change_password_page_current_password_user_field_send_text(password);
//        adcp.admin_logger_change_password_page_submit_button_is_clicked();
//        adcp.admin_logger_change_password_page_new_password_userfield_is_sendText(AppHooks.prop.getProperty("admin_password"));
//        adcp.admin_logger_change_password_page_comfirm_password_userfield_is_sendText(AppHooks.prop.getProperty("admin_password"));
//        adcp.admin_logger_change_password_page_submit_button_is_clicked();
//        adlogin.admin_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("admin_email"));
//        adlogin.admin_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("admin_password"));
//        adlogin.admin_sign_in_button_is_clicked();   
//        //Due to un authentication pop up click two times
//        try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//        
//        adlogin.admin_sign_in_button_is_clicked();
//        boolean actual = admain.admin_logger_profile_dropdown_button_is_displayed();
//        Assert.assertEquals(actual, true);
//        logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//    /*
//     * 
//     * 
//     * 
//     * 
//     * 
//     * 
//     * 
//     * 
//     * 
//     * 
//     */
//    
//    @When("admin enter the valid password into the userfield and clcik on submit button from change password page")
//    public void admin_enter_the_valid_password_into_the_userfield_and_clcik_on_submit_button_from_change_password_page() {
//    	adcp.admin_logger_change_password_page_current_password_user_field_send_text(AppHooks.prop.getProperty("admin_password"));
//        adcp.admin_logger_change_password_page_submit_button_is_clicked();
//        logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @When("admin current enter new password {string} and click on submit button from change password page")
//    public void admin_current_enter_new_password_and_click_on_submit_button_from_change_password_page(String string) {
//    	adcp.admin_logger_change_password_page_new_password_userfield_is_sendText(string);
//        String actual = adcp.admin_logger_change_password_page_new_password_userfield_is_value();
//        adcp.admin_logger_change_password_page_submit_button_is_clicked();
//	    Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @When("admin current enter password {string} and click on submit button from change password page")
//    public void admin_current_enter_password_and_click_on_submit_button_from_change_password_page(String string) {
//    	adcp.admin_logger_change_password_page_new_password_userfield_is_sendText(string);
//    	 String actual = adcp.admin_logger_change_password_page_new_password_userfield_is_value();
//    	 adcp.admin_logger_change_password_page_submit_button_is_clicked();
//	    Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//	@Then("Verify that admin should get the red tick with note below the password user field from change password page")
//	public void verify_that_admin_should_get_the_red_tick_with_note_below_the_password_user_field_from_change_password_page() {
//		boolean actual=adcp.admin_logger_new_password_userfield_below_note_text_is_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//	
//	@Then("Verify that admin should not get any red tick with note below the password user field from change password page")
//	public void verify_that_admin_should_not_get_any_red_tick_with_note_below_the_password_user_field_from_change_password_page() {
//		boolean actual=adcp.admin_logger_new_password_userfield_below_note_text_is_not_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//    
//	/*
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//	
//	@When("admin is on the second page of comfirm password")
//	public void user_is_on_the_second_page_of_comfirm_password() {
//		adcp.admin_logger_change_password_page_current_password_user_field_send_text(AppHooks.prop.getProperty("admin_password"));
//		adcp.admin_logger_change_password_page_submit_button_is_clicked();
//	    
//	}
//	
//	@Then("Verify that cancel button should navigated to the dashboard page in change password from admin user profile page")
//	public void verify_that_cancel_button_should_navigated_to_the_dashboard_page_in_change_password_from_admin_user_profile_page() {
//		adcp.admin_logger_change_password_page_cancel_button_is_click();
//	    boolean actual=admain.admin_logger_image_in_the_card_box_is_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName()); 
//	}
//	
//	/*
//	 * 
//	 * 
//	 * 
//	 * 
//	 * password comfirmation
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//	
//	@When("admin is enter the password as {string} in change password")
//	public void user_is_enter_the_password_as_in_change_password(String string) {
//		adcp.admin_logger_change_password_page_new_password_userfield_is_sendText(string);
//	    String actual = adcp.admin_logger_change_password_page_new_password_user_field_value();
//	    Assert.assertEquals(actual, string);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@When("admin is enter the comfirm password as {string} and click on submit button in change password")
//	public void user_is_enter_the_comfirm_password_as_and_click_on_submit_button_in_change_password(String string) {
//		adcp.admin_logger_change_password_page_comfirm_password_userfield_is_sendText(string);
//	    String actual = adcp.admin_logger_change_password_page_comfirm_password_user_field_value();
//	    Assert.assertEquals(actual, string);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		adcp.admin_logger_change_password_page_submit_button_is_clicked();
//	}
//	
//	@Then("Verify that admin log in page have sign in button is displayed the comfirm password user field in change password")
//	public void verify_admin_log_in_page_have_sign_in_button_is_displayed_the_comfirm_password_user_field_in_change_password() {
//		boolean actual=adlogin.admin_log_in_page_have_sign_in_button_is_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//	
//	@Then("Verify that admin should get any red tick and note below the comfirm password user field in change password")
//	public void verify_that_user_should_get_any_red_tick_and_note_below_the_comfirm_password_user_field_in_change_password() {
//		boolean actual=adcp.admin_logger_change_pass_comfirm_password_userfield_below_note_text_is_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//
//}