$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/PurchaseAsAUser.feature");
formatter.feature({
  "line": 1,
  "name": "Validate purchase as a user",
  "description": "",
  "id": "validate-purchase-as-a-user",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8551276902,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Validate the account name",
  "description": "",
  "id": "validate-purchase-as-a-user;validate-the-account-name",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@nila"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click the sign in option on the top right",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter user name and password in the field",
  "rows": [
    {
      "cells": [
        "nmazum@gmail.com",
        "3f6@b@57D555@SP"
      ],
      "line": 7
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click the Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on the women option from the menu",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click product from product list",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click add to cart and see the success msg",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on continue shopping",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Tops from the women submenu",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on the \"Blouse\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I land on the product description page and see the logo",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on the size drop down and select \"M\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select the colour \"White\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I see the success message and I click on the cross icon",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I land on the previous page and I click on the cart icon",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I land on the shopping summary page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on the proceed to checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I land on the Address page and click on proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I land on the shopping page and and see the banner",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click the TAndC check box",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on the proceed to checkout tab",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I land on the payment method page and select \"Pay by bank transfer\" option",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on the confirmation button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I see a success message \"Your order on My Store is complete\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToBasketSteps.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 5227035990,
  "status": "passed"
});
formatter.match({
  "location": "AccountStep.i_click_the_sign_in_option_on_the_top_right()"
});
formatter.result({
  "duration": 1718982724,
  "status": "passed"
});
formatter.match({
  "location": "AccountName.i_enter_user_name_and_password_in_the_field(DataTable)"
});
formatter.result({
  "duration": 877394519,
  "status": "passed"
});
formatter.match({
  "location": "AccountName.i_click_the_Sign_in_button()"
});
formatter.result({
  "duration": 1724249290,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseUserStep.i_click_on_the_women_option_from_the_menu()"
});
formatter.result({
  "duration": 2704480585,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseUserStep.i_click_product_from_product_list()"
});
formatter.result({
  "duration": 402946657,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseUserStep.i_click_add_to_cart_and_see_the_success_msg()"
});
formatter.result({
  "duration": 422159313,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseUserStep.i_click_on_continue_shopping()"
});
formatter.result({
  "duration": 694585633,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseUserStep.i_click_on_Tops_from_the_women_submenu()"
});
formatter.result({
  "duration": 1901482164,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 16
    }
  ],
  "location": "PurchaseUserStep.i_click_on_the(String)"
});
formatter.result({
  "duration": 295678637,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseUserStep.i_land_on_the_product_description_page_and_see_the_logo()"
});
formatter.result({
  "duration": 133298720,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "M",
      "offset": 42
    }
  ],
  "location": "PurchaseUserStep.i_click_on_the_size_drop_down_and_select(String)"
});
formatter.result({
  "duration": 5074041954,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"*[name\u003d\u0027group_1\u0027]\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027Dwainilas-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:893:e3c7:28b1:f714%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: /var/folders/0b/d32fxb0j0tx...}, goog:chromeOptions: {debuggerAddress: localhost:55482}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 116ffb0e83a4689e01dd8c14bbe4ec61\n*** Element info: {Using\u003dname, value\u003dgroup_1}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:400)\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\n\tat pageObject.PurchaseUserObj.setSelectSize(PurchaseUserObj.java:87)\n\tat stepsDefinition.PurchaseUserStep.i_click_on_the_size_drop_down_and_select(PurchaseUserStep.java:54)\n\tat ✽.And I click on the size drop down and select \"M\"(src/test/java/features/PurchaseAsAUser.feature:16)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "White",
      "offset": 21
    }
  ],
  "location": "PurchaseUserStep.i_select_the_colour(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PurchaseUserStep.i_click_on_add_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PurchaseUserStep.i_see_the_success_message_and_I_click_on_the_cross_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PurchaseUserStep.i_land_on_the_previous_page_and_I_click_on_the_cart_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PurchaseUserStep.i_land_on_the_shopping_summary_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PurchaseUserStep.i_click_on_the_proceed_to_checkout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PurchaseUserStep.i_land_on_the_Address_page_and_click_on_proceed_to_check_out()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PurchaseUserStep.i_land_on_the_shopping_page_and_and_see_the_banner()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PurchaseUserStep.i_click_the_TAndC_check_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PurchaseUserStep.i_click_on_the_proceed_to_checkout_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Pay by bank transfer",
      "offset": 46
    }
  ],
  "location": "PurchaseUserStep.i_land_on_the_payment_method_page_and_select_option(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PurchaseUserStep.i_click_on_the_confirmation_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Your order on My Store is complete",
      "offset": 25
    }
  ],
  "location": "PurchaseUserStep.i_see_a_success_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1221156281,
  "status": "passed"
});
});