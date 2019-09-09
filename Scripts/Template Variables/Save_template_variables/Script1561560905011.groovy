import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.delay(2)

WebUI.click(findTestObject('Template_Variables/Add_TemplateVariable/button_Add Variable'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Template_Variables/Add_TemplateVariable/input_Unique Name_form-control'), 'Test123')

WebUI.delay(1)

WebUI.click(findTestObject('Template_Variables/Add_TemplateVariable/a_Please select'))

WebUI.delay(1)

WebUI.click(findTestObject('Template_Variables/Add_TemplateVariable/Image_Template_Type'))

WebUI.delay(1)

WebUI.click(findTestObject('Template_Variables/Add_TemplateVariable/DataType_dd_image'))

WebUI.delay(1)

//WebUI.setText(findTestObject('Template_Variables/Add_TemplateVariable/input_Image_s2id_autogen63_search'), 'Image')

WebUI.click(findTestObject('Template_Variables/Add_TemplateVariable/Page_Template Variables  BaseTenants/Page_Template Variables  BaseTenants/div_Banner_Image'))

WebUI.click(findTestObject('Template_Variables/Add_TemplateVariable/button_Save'))

WebUI.getText(findTestObject('Template_Variables/Add_TemplateVariable/Grid_Name_FirstValue'), FailureHandling.STOP_ON_FAILURE)

