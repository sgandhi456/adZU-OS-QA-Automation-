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

WebUI.waitForElementPresent(findTestObject('Template_Variables/Search_TemplateVariables/Template_Variable_Filter_Toggle'), 
    1)

WebUI.click(findTestObject('Template_Variables/Search_TemplateVariables/Template_Variable_Filter_Toggle'))

WebUI.waitForElementPresent(findTestObject('Material/Search Material/Text_SearchMaterial'), 1)

WebUI.setText(findTestObject('Material/Search Material/Text_SearchMaterial'), 'Material_Test')

WebUI.waitForElementVisible(findTestObject('Template_Variables/Search_TemplateVariables/Template_Variable_Hide_Button'), 
    1)

WebUI.click(findTestObject('Template_Variables/Search_TemplateVariables/Template_Variable_Hide_Button'))

WebUI.delay(1)

