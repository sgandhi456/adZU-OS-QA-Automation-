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

WebUI.click(findTestObject('Asset Group/Add Asset Group/Create New'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Asset Group/Add Asset Group/input_Asset Type_s2id_autogen478'))

WebUI.setText(findTestObject('Asset Group/Add Asset Group/input_Asset Type_s2id_autogen478'), 'Image')

WebUI.delay(1)

WebUI.click(findTestObject('Asset Group/Add Asset Group/Select_Asset Type_Image'))

WebUI.delay(1)

WebUI.setText(findTestObject('Asset Group/Add Asset Group/input_Name_Asset_Group_Name'), 'New999')

WebUI.click(findTestObject('Asset Group/Add Asset Group/button_Save'))

