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
import org.openqa.selenium.Keys as Keys

WebUI.delay(0)

WebUI.click(findTestObject('Material/Delete Material/Menu_MaterialAction'))

WebUI.delay(1)

WebUI.click(findTestObject('Material/Build Material/Menu_Build'))

WebUI.delay(1)

WebUI.click(findTestObject('Material/Build Material/FirstCustomisationStep_Button'))

WebUI.delay(1)

WebUI.setText(findTestObject('Material/Build Material/Text_AssetSearch'), 'adzu')

WebUI.click(findTestObject('Material/Build Material/Select_Image'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Material/Build Material/Button_OK_Image'))

WebUI.delay(1)

WebUI.click(findTestObject('Material/Build Material/Button_Generate'))

WebUI.acceptAlert()

