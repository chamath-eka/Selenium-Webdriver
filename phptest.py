from selenium import webdriver
import time
driver = webdriver.Chrome()
driver.get("https://www.redhotpawn.com/site/login.php")
a = driver.find_element_by_id("loginemailId").send_keys("youremail")
a = driver.find_element_by_id("loginpasswordId").send_keys("password")
driver.find_element_by_id("Login_id").click();
time.sleep(3);
driver.close();
