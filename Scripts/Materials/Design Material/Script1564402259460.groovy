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

WebUI.delay(0)

WebUI.click(findTestObject('Material/Delete Material/Menu_MaterialAction'))

WebUI.delay(1)

WebUI.click(findTestObject('Material/Design Material/MenuOption_Design'))

WebUI.click(findTestObject('Material/Design Material/Add_Customisation Steps'))

WebUI.delay(1)

WebUI.setText(findTestObject('CustomisationsStep_Name'), 'Image')

WebUI.scrollToElement(findTestObject('Material/Design Material/button_ContentEditor'), 0)

WebUI.click(findTestObject('Material/Design Material/button_ContentEditor'))

WebUI.delay(1)

WebUI.setText(findTestObject('Material/Design Material/ImageEditor_Name'), 'Asset Image')

WebUI.click(findTestObject('Material/Design Material/Button_SelectVariables'))

WebUI.delay(1)

WebUI.click(findTestObject('Material/Design Material/span_Retina_Test Retina_Test_k-checkbox-label'))

WebUI.delay(1)

WebUI.click(findTestObject('Material/Design Material/button_Save_templatevarable'))

WebUI.delay(1)

WebUI.click(findTestObject('Material/Design Material/dropdown_AssetGroup'))

WebUI.delay(1)

WebUI.click(findTestObject('Material/Design Material/AssetGroup_Option'))

WebUI.click(findTestObject('Material/Design Material/Button_SaveCustomisationStep'))

WebUI.click(findTestObject('Material/Design Material/Material_Design_CustomSize'))

WebUI.click(findTestObject('Material/Design Material/button_design_Save'))

