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

WebUI.callTestCase(findTestCase('Application - Login/Login - STA'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Login/span_Satinder'))

WebUI.click(findTestObject('Translation/Page_Base/a_Globalisation Info'))

WebUI.click(findTestObject('Translation/Page_Base/span_English (United Kingdom)'))

WebUI.setText(findTestObject('Translation/Page_Base/input_concat(id(  s2id_autogen2_search  ))_s2id_autogen2_search'), 'Russian')

WebUI.click(findTestObject('Translation/Page_Base/div_Russian (Russia)'))

WebUI.click(findTestObject('Translation/Page_Base/button_Save'))

WebUI.verifyElementText(findTestObject('Translation/Page_Base/a_Home'), 'Главная')

WebUI.verifyElementText(findTestObject('Main Menu/Create Menu/a_Create'), 'Создать')

