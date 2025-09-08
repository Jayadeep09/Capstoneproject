Feature:Checking user login
Scenario:Successful login
Given Bstack website should be opened in default browser
And Click on signin link and add <username> and <password> 
Then click on login button
Examples:
|username|password|
|demouser|testingisfun99|
|fav_user|testingisfun99|
|image_not_loading_user|testingisfun99|
|existing_orders_user|testingisfun99|
