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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bt.adzu4-staging.codeworldwide.com/#Admin/Materials/Templates')

WebUI.setText(findTestObject('Object Repository/Test1/Page_Templates  BaseTenants/input_Update your browser_us1'), 'satinder.gandhi@codeworldwide.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test1/Page_Templates  BaseTenants/input_Update your browser_pa1_1'), 
    'yfq/9fVkW5+QvfzWq38qvg==')

WebUI.click(findTestObject('Object Repository/Test1/Page_Templates  BaseTenants/button_Login'))

