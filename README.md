Notes about framework:-

TesterName:- Chirag Prajapati

1.I have used testNG framework to achieve following assessment.
2.I have added plugin to pom.xml so, you can also run testcases through pom.xml or command line for parallel run.
3. BrowserFactory contains code for opening any browser, so we can do cross browser testing through testNg file by reading browserNme either form propertyFile or bestTest(we need to create different method for reading browser name for baseTest for crossBrowserTesting).
4.CommonUtil is for achieving synchronization by implicit wait and aslo for getting current time for taking screenshots.
5.BasePage is for finding element elements.
