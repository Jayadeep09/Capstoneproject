Feature:Search Future
Scenario Outline:search feature
Given open home page in defaults browser1
When go to <search> and add some text and click on search
Then close driver
Examples:
|search|
|Apple|
|Google|
|Vivo|
|Oppo|
|Samsung|