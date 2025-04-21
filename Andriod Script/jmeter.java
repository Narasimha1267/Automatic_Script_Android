//package SyraHealth;
//
//public class jmeter {
//	
//	
//	<?xml version="1.0" encoding="UTF-8"?>
//	<jmeterTestPlan version="1.2" properties="5.0" jmeter="5.6.2">
//	  <hashTree>
//	    <TestPlan guiclass="TestPlanGui" testclass="TestPlan" testname="Syra_Training" enabled="true">
//	      <boolProp name="TestPlan.functional_mode">false</boolProp>
//	      <boolProp name="TestPlan.tearDown_on_shutdown">false</boolProp>
//	      <boolProp name="TestPlan.serialize_threadgroups">false</boolProp>
//	      <elementProp name="TestPlan.user_defined_variables" elementType="Arguments" guiclass="ArgumentsPanel" testclass="Arguments" testname="User Defined Variables" enabled="true">
//	        <collectionProp name="Arguments.arguments">
//	          <elementProp name="RampdownTime" elementType="Argument">
//	            <stringProp name="Argument.name">RampdownTime</stringProp>
//	            <stringProp name="Argument.metadata">=</stringProp>
//	          </elementProp>
//	          <elementProp name="RampupTime" elementType="Argument">
//	            <stringProp name="Argument.name">RampupTime</stringProp>
//	            <stringProp name="Argument.metadata">=</stringProp>
//	          </elementProp>
//	        </collectionProp>
//	      </elementProp>
//	    </TestPlan>
//	    <hashTree>
//	      <ThreadGroup guiclass="ThreadGroupGui" testclass="ThreadGroup" testname="Thread Group" enabled="true">
//	        <stringProp name="ThreadGroup.on_sample_error">continue</stringProp>
//	        <elementProp name="ThreadGroup.main_controller" elementType="LoopController" guiclass="LoopControlPanel" testclass="LoopController" testname="Loop Controller" enabled="true">
//	          <stringProp name="LoopController.loops">1</stringProp>
//	          <boolProp name="LoopController.continue_forever">false</boolProp>
//	        </elementProp>
//	        <stringProp name="ThreadGroup.num_threads">1</stringProp>
//	        <stringProp name="ThreadGroup.ramp_time">30</stringProp>
//	        <boolProp name="ThreadGroup.delayedStart">false</boolProp>
//	        <boolProp name="ThreadGroup.scheduler">false</boolProp>
//	        <stringProp name="ThreadGroup.duration">10000</stringProp>
//	        <stringProp name="ThreadGroup.delay"></stringProp>
//	        <boolProp name="ThreadGroup.same_user_on_next_iteration">false</boolProp>
//	      </ThreadGroup>
//	      <hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="My Profile Screen" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Profile Details" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_profile_details</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration"></stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="After Login User Data Screen" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Resource User Data" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_user_data</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Home - Initial Screen" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Profile Details" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_profile_details</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Dashboard Details" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_dashboard_details</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	            <stringProp name="HTTPSampler.implementation">HttpClient4</stringProp>
//	            <stringProp name="TestPlan.comments">Created from cURL on 2023-11-10T12:22:26.9844466</stringProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <RegexExtractor guiclass="RegexExtractorGui" testclass="RegexExtractor" testname="Regular Expression Extractor" enabled="false">
//	              <stringProp name="RegexExtractor.useHeaders">false</stringProp>
//	              <boolProp name="RegexExtractor.default_empty_value">false</boolProp>
//	            </RegexExtractor>
//	            <hashTree/>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Home - Two Weeks Quiz Screen" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Two Weeks Questionnaire" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_questionnaire_everytwoweeks</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Home - Substance Use Screen" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Substance Use Score" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_dashboard_substanceuse_details</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Home - Anxiety Score Screen" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Anxiety Score" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_dashboard_anxiety_details</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Home - Insomnia Score Screen" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Insomnia Score" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_dashboard_insomnia_details</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Home - Depression Score Screen" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Depression Score" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_dashboard_depression_details</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Home - Anger Score Screen" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Anger Score" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.port">443</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_dashboard_anger_details</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Diary - Ask Syra Screen" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">false</boolProp>
//	        </TransactionController>
//	        <hashTree/>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Diary - Previous Entries - Date range selected" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="GetDiaryHistoryChatSessionsCount" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments">
//	                <elementProp name="startDate" elementType="HTTPArgument">
//	                  <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                  <stringProp name="Argument.metadata">=</stringProp>
//	                  <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                  <stringProp name="Argument.name">startDate</stringProp>
//	                  <stringProp name="Argument.value">${__timeShift(yyyy-MM-dd,,-P30D,,)}</stringProp>
//	                </elementProp>
//	                <elementProp name="endDate" elementType="HTTPArgument">
//	                  <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                  <stringProp name="Argument.metadata">=</stringProp>
//	                  <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                  <stringProp name="Argument.name">endDate</stringProp>
//	                  <stringProp name="Argument.value">${__timeShift(yyyy-MM-dd,,,,)}</stringProp>
//	                </elementProp>
//	              </collectionProp>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_chat_session_per_month?</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Diary - Previous Entries Screen" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="GetDiaryHistoryDefaultSessions" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_chat_top_sessions</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Activities - Activities Screen" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Videos" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_activity_videos</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Get Better - Initial Screen" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="GetAllScheduledActivities" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_user_active_activity</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Active Groups" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_getactive_groups</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Silent API to get new schedule" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_schedule_activity_next_occurrence</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Get Better - 20+ Activities Screen" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="GetActiveGroupById" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments">
//	                <elementProp name="groupId" elementType="HTTPArgument">
//	                  <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                  <stringProp name="Argument.metadata">=</stringProp>
//	                  <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                  <stringProp name="Argument.name">groupId</stringProp>
//	                  <stringProp name="Argument.value">${__Random(1,5)}</stringProp>
//	                </elementProp>
//	              </collectionProp>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_getactive_group_activities</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Get Better - Create Activity" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="ScheduleActivity" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">true</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments">
//	              <collectionProp name="Arguments.arguments">
//	                <elementProp name="" elementType="HTTPArgument">
//	                  <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                  <stringProp name="Argument.value">{&#xd;
//	    &quot;obstacles&quot;: &quot;Mjg&quot;,&#xd;
//	    &quot;scheduledForDatetime&quot;: &#xd;
//	        [&quot;${ScheduledDate}&quot;]&#xd;
//	    ,&#xd;
//	    &quot;activityID&quot;: ${activityId},&#xd;
//	    &quot;overcomeObstacles&quot;: &quot;Lkg&quot;,&#xd;
//	    &quot;activityTitle&quot;: &quot;${activityTitle}&quot;,&#xd;
//	    &quot;isMeaningful&quot;: &quot;Very much&quot;,&#xd;
//	    &quot;activityOccurrenceFrequency&quot;: &quot;Once a week&quot;,&#xd;
//	    &quot;groupID&quot;: ${groupId},&#xd;
//	    &quot;scaleValue&quot;: 4&#xd;
//	}</stringProp>
//	                  <stringProp name="Argument.metadata">=</stringProp>
//	                </elementProp>
//	              </collectionProp>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_user_scheduling_activity</stringProp>
//	            <stringProp name="HTTPSampler.method">POST</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion - Message" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="1898135705">Successfully uploaded</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_data</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">2</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	          <UserParameters guiclass="UserParametersGui" testclass="UserParameters" testname="User Parameters" enabled="true">
//	            <collectionProp name="UserParameters.names">
//	              <stringProp name="-1815005733">ScheduledDate</stringProp>
//	              <stringProp name="-960620687">NewOccurrence</stringProp>
//	            </collectionProp>
//	            <collectionProp name="UserParameters.thread_values">
//	              <collectionProp name="-1723333903">
//	                <stringProp name="632140874">${__time(yyyy-MM-dd&apos;T&apos;hh:mm:ss)}</stringProp>
//	                <stringProp name="65793529">Daily</stringProp>
//	              </collectionProp>
//	            </collectionProp>
//	            <boolProp name="UserParameters.per_iteration">false</boolProp>
//	          </UserParameters>
//	          <hashTree/>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Get Better - View Active Activity" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="ViewActivity" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_user_active_activity</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion - Message" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="1460371883">${activityTitle}</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_data</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">2</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Get Better - Reschedule Activity" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="RescheduleActivity" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">true</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments">
//	              <collectionProp name="Arguments.arguments">
//	                <elementProp name="" elementType="HTTPArgument">
//	                  <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                  <stringProp name="Argument.value">{&#xd;
//	    &quot;activityTitle&quot;: &quot;${activityTitle}&quot;,&#xd;
//	    &quot;activityOccurrenceFrequency&quot;: &quot;${NewOccurrence}&quot;,&#xd;
//	    &quot;scheduledForDatetime&quot;: [&#xd;
//	        &quot;${ScheduledDate}&quot;&#xd;
//	    ],&#xd;
//	    &quot;previousOccurrenceFrequency&quot;: &quot;Once a week&quot;,&#xd;
//	    &quot;groupID&quot;: ${groupId},&#xd;
//	    &quot;activityID&quot;: ${activityId}&#xd;
//	}</stringProp>
//	                  <stringProp name="Argument.metadata">=</stringProp>
//	                </elementProp>
//	              </collectionProp>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_reschedule_getbetter_activity</stringProp>
//	            <stringProp name="HTTPSampler.method">PATCH</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion - Message" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="1898135705">Successfully uploaded</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_data</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">2</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Get Better - Delete Activity" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="DeleteActivity" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">true</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments">
//	              <collectionProp name="Arguments.arguments">
//	                <elementProp name="" elementType="HTTPArgument">
//	                  <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                  <stringProp name="Argument.value">{&#xd;
//	    &quot;activityOccurrenceFrequency&quot;: &quot;${NewOccurrence}&quot;,&#xd;
//	    &quot;activityID&quot;: ${activityId},&#xd;
//	    &quot;activityTitle&quot;: &quot;${activityTitle}&quot;,&#xd;
//	    &quot;groupID&quot;: ${groupId}&#xd;
//	}</stringProp>
//	                  <stringProp name="Argument.metadata">=</stringProp>
//	                </elementProp>
//	              </collectionProp>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_delete_scheduled_activity</stringProp>
//	            <stringProp name="HTTPSampler.method">DELETE</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion - Message" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="-101326144">Successfully deleted</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_data</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">2</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="true">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Get Better - Get Questions To Schedule Activity" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="GetQuestionsToScheduleAnActivity" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_better_followup_questions</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <TestAction guiclass="TestActionGui" testclass="TestAction" testname="Think Time" enabled="false">
//	          <intProp name="ActionProcessor.action">1</intProp>
//	          <intProp name="ActionProcessor.target">0</intProp>
//	          <stringProp name="ActionProcessor.duration">0</stringProp>
//	        </TestAction>
//	        <hashTree>
//	          <UniformRandomTimer guiclass="UniformRandomTimerGui" testclass="UniformRandomTimer" testname="Pause" enabled="true">
//	            <stringProp name="ConstantTimer.delay">1000</stringProp>
//	            <stringProp name="RandomTimer.range">100</stringProp>
//	          </UniformRandomTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Baseline Questions" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments"/>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Demographic Questions" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments"/>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_demographic_ques_get</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          <stringProp name="HTTPSampler.implementation">HttpClient4</stringProp>
//	          <stringProp name="TestPlan.comments">Created from cURL on 2023-11-10T12:55:00.0848807</stringProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Post - Resource User Questionnaire details" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">true</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments">
//	            <collectionProp name="Arguments.arguments">
//	              <elementProp name="" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.value">{&#xd;
//	    &quot;email&quot;: &quot;&quot;,&#xd;
//	    &quot;response&quot;: [&#xd;
//	        { &#xd;
//	            &quot;category_id&quot;: 1,&#xd;
//	            &quot;ques_id&quot;: 1,&#xd;
//	            &quot;category&quot;: &quot;Depression&quot;,&#xd;
//	            &quot;option_value&quot;: 0,&#xd;
//	            &quot;question_code&quot;: &quot;PHQ-9-1&quot;&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category_id&quot;: 1,&#xd;
//	            &quot;ques_id&quot;: 2,&#xd;
//	            &quot;question_code&quot;: &quot;PHQ-9-2&quot;,&#xd;
//	            &quot;option_value&quot;: 1,&#xd;
//	            &quot;category&quot;: &quot;Depression&quot;&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category_id&quot;: 1,&#xd;
//	            &quot;ques_id&quot;: 3,&#xd;
//	            &quot;category&quot;: &quot;Depression&quot;,&#xd;
//	            &quot;option_value&quot;: 2,&#xd;
//	            &quot;question_code&quot;: &quot;PHQ-9-3&quot;&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;question_code&quot;: &quot;PHQ-9-4&quot;,&#xd;
//	            &quot;category_id&quot;: 1,&#xd;
//	            &quot;ques_id&quot;: 4,&#xd;
//	            &quot;option_value&quot;: 3,&#xd;
//	            &quot;category&quot;: &quot;Depression&quot;&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category&quot;: &quot;Depression&quot;,&#xd;
//	            &quot;question_code&quot;: &quot;PHQ-9-5&quot;,&#xd;
//	            &quot;category_id&quot;: 1,&#xd;
//	            &quot;ques_id&quot;: 5,&#xd;
//	            &quot;option_value&quot;: 1&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category&quot;: &quot;Depression&quot;,&#xd;
//	            &quot;category_id&quot;: 1,&#xd;
//	            &quot;option_value&quot;: 0,&#xd;
//	            &quot;question_code&quot;: &quot;PHQ-9-6&quot;,&#xd;
//	            &quot;ques_id&quot;: 6&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;ques_id&quot;: 7,&#xd;
//	            &quot;category_id&quot;: 1,&#xd;
//	            &quot;category&quot;: &quot;Depression&quot;,&#xd;
//	            &quot;question_code&quot;: &quot;PHQ-9-7&quot;,&#xd;
//	            &quot;option_value&quot;: 2&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;question_code&quot;: &quot;PHQ-9-8&quot;,&#xd;
//	            &quot;category&quot;: &quot;Depression&quot;,&#xd;
//	            &quot;category_id&quot;: 1,&#xd;
//	            &quot;ques_id&quot;: 8,&#xd;
//	            &quot;option_value&quot;: 3&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;question_code&quot;: &quot;PHQ-9-9&quot;,&#xd;
//	            &quot;category&quot;: &quot;Depression&quot;,&#xd;
//	            &quot;ques_id&quot;: 9,&#xd;
//	            &quot;option_value&quot;: 1,&#xd;
//	            &quot;category_id&quot;: 1&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category&quot;: &quot;Anger&quot;,&#xd;
//	            &quot;category_id&quot;: 2,&#xd;
//	            &quot;ques_id&quot;: 1,&#xd;
//	            &quot;question_code&quot;: &quot;PHQ-9-10&quot;,&#xd;
//	            &quot;option_value&quot;: 0&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category_id&quot;: 3,&#xd;
//	            &quot;option_value&quot;: 2,&#xd;
//	            &quot;question_code&quot;: &quot;GAD-7-1&quot;,&#xd;
//	            &quot;category&quot;: &quot;Anxiety&quot;,&#xd;
//	            &quot;ques_id&quot;: 1&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category_id&quot;: 3,&#xd;
//	            &quot;option_value&quot;: 3,&#xd;
//	            &quot;question_code&quot;: &quot;GAD-7-2&quot;,&#xd;
//	            &quot;category&quot;: &quot;Anxiety&quot;,&#xd;
//	            &quot;ques_id&quot;: 2&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;ques_id&quot;: 3,&#xd;
//	            &quot;option_value&quot;: 1,&#xd;
//	            &quot;category&quot;: &quot;Anxiety&quot;,&#xd;
//	            &quot;category_id&quot;: 3,&#xd;
//	            &quot;question_code&quot;: &quot;GAD-7-3&quot;&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category_id&quot;: 3,&#xd;
//	            &quot;ques_id&quot;: 4,&#xd;
//	            &quot;option_value&quot;: 0,&#xd;
//	            &quot;category&quot;: &quot;Anxiety&quot;,&#xd;
//	            &quot;question_code&quot;: &quot;GAD-7-4&quot;&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;question_code&quot;: &quot;GAD-7-5&quot;,&#xd;
//	            &quot;option_value&quot;: 2,&#xd;
//	            &quot;category&quot;: &quot;Anxiety&quot;,&#xd;
//	            &quot;category_id&quot;: 3,&#xd;
//	            &quot;ques_id&quot;: 5&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category&quot;: &quot;Anxiety&quot;,&#xd;
//	            &quot;category_id&quot;: 3,&#xd;
//	            &quot;question_code&quot;: &quot;GAD-7-6&quot;,&#xd;
//	            &quot;ques_id&quot;: 6,&#xd;
//	            &quot;option_value&quot;: 3&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category&quot;: &quot;Anxiety&quot;,&#xd;
//	            &quot;category_id&quot;: 3,&#xd;
//	            &quot;option_value&quot;: 1,&#xd;
//	            &quot;question_code&quot;: &quot;GAD-7-7&quot;,&#xd;
//	            &quot;ques_id&quot;: 7&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category&quot;: &quot;Substance use&quot;,&#xd;
//	            &quot;category_id&quot;: 4,&#xd;
//	            &quot;ques_id&quot;: 1,&#xd;
//	            &quot;option_value&quot;: 2,&#xd;
//	            &quot;question_code&quot;: &quot;NIDA-1&quot;&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;question_code&quot;: &quot;NIDA-2&quot;,&#xd;
//	            &quot;category_id&quot;: 4,&#xd;
//	            &quot;category&quot;: &quot;Substance use&quot;,&#xd;
//	            &quot;ques_id&quot;: 2,&#xd;
//	            &quot;option_value&quot;: 0&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category&quot;: &quot;Substance use&quot;,&#xd;
//	            &quot;category_id&quot;: 4,&#xd;
//	            &quot;ques_id&quot;: 3,&#xd;
//	            &quot;option_value&quot;: 0,&#xd;
//	            &quot;question_code&quot;: &quot;NIDA-3&quot;&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;ques_id&quot;: 1,&#xd;
//	            &quot;category&quot;: &quot;Substance use&quot;,&#xd;
//	            &quot;question_code&quot;: &quot;NIDA-Modified ASSIST-1&quot;,&#xd;
//	            &quot;category_id&quot;: 5,&#xd;
//	            &quot;option_value&quot;: 2&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category_id&quot;: 5,&#xd;
//	            &quot;option_value&quot;: 0,&#xd;
//	            &quot;category&quot;: &quot;Substance use&quot;,&#xd;
//	            &quot;ques_id&quot;: 2,&#xd;
//	            &quot;question_code&quot;: &quot;NIDA-Modified ASSIST-2&quot;&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category_id&quot;: 5,&#xd;
//	            &quot;question_code&quot;: &quot;NIDA-Modified ASSIST-3&quot;,&#xd;
//	            &quot;option_value&quot;: 2,&#xd;
//	            &quot;category&quot;: &quot;Substance use&quot;,&#xd;
//	            &quot;ques_id&quot;: 3&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category_id&quot;: 5,&#xd;
//	            &quot;option_value&quot;: 0,&#xd;
//	            &quot;question_code&quot;: &quot;NIDA-Modified ASSIST-4&quot;,&#xd;
//	            &quot;category&quot;: &quot;Substance use&quot;,&#xd;
//	            &quot;ques_id&quot;: 4&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;ques_id&quot;: 5,&#xd;
//	            &quot;option_value&quot;: 1,&#xd;
//	            &quot;category&quot;: &quot;Substance use&quot;,&#xd;
//	            &quot;category_id&quot;: 5,&#xd;
//	            &quot;question_code&quot;: &quot;NIDA-Modified ASSIST-5&quot;&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;option_value&quot;: 0,&#xd;
//	            &quot;question_code&quot;: &quot;NIDA-Modified ASSIST-6&quot;,&#xd;
//	            &quot;category_id&quot;: 5,&#xd;
//	            &quot;category&quot;: &quot;Substance use&quot;,&#xd;
//	            &quot;ques_id&quot;: 6&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;ques_id&quot;: 7,&#xd;
//	            &quot;option_value&quot;: 0,&#xd;
//	            &quot;category_id&quot;: 5,&#xd;
//	            &quot;category&quot;: &quot;Substance use&quot;,&#xd;
//	            &quot;question_code&quot;: &quot;NIDA-Modified ASSIST-7&quot;&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;category&quot;: &quot;Substance use&quot;,&#xd;
//	            &quot;category_id&quot;: 5,&#xd;
//	            &quot;ques_id&quot;: 8,&#xd;
//	            &quot;option_value&quot;: 0,&#xd;
//	            &quot;question_code&quot;: &quot;NIDA-Modified ASSIST-8&quot;&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;option_value&quot;: 0,&#xd;
//	            &quot;ques_id&quot;: 9,&#xd;
//	            &quot;category&quot;: &quot;Substance use&quot;,&#xd;
//	            &quot;question_code&quot;: &quot;NIDA-Modified ASSIST-9&quot;,&#xd;
//	            &quot;category_id&quot;: 5&#xd;
//	        } ,&#xd;
//	        { &#xd;
//	            &quot;ques_id&quot;: 10,&#xd;
//	            &quot;question_code&quot;: &quot;NIDA-Modified ASSIST-10&quot;,&#xd;
//	            &quot;option_value&quot;: 0,&#xd;
//	            &quot;category&quot;: &quot;Substance use&quot;,&#xd;
//	            &quot;category_id&quot;: 5&#xd;
//	        } &#xd;
//	    ]&#xd;
//	}</stringProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_user_questionnaire_details</stringProp>
//	          <stringProp name="HTTPSampler.method">POST</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree/>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Reschedule - GetQuestionsToScheduleAnActivity" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments"/>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_better_followup_questions?rescheduled=true</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get feedback questions" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">true</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments">
//	            <collectionProp name="Arguments.arguments">
//	              <elementProp name="" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.value">{&#xd;
//	    &quot;activityID&quot;: 1,&#xd;
//	    &quot;activityTitle&quot;: &quot;Spending time with family&quot;,&#xd;
//	    &quot;groupID&quot;: 1&#xd;
//	}</stringProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_feedback_questions</stringProp>
//	          <stringProp name="HTTPSampler.method">POST</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="GetDiaryHistoryChatSessionsPerMonthCount" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments">
//	              <elementProp name="startDate" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	                <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                <stringProp name="Argument.name">startDate</stringProp>
//	                <stringProp name="Argument.value">${__Random(1900,2022)}-${__Random(1,11)}-${__Random(1,30)}</stringProp>
//	              </elementProp>
//	              <elementProp name="endDate" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	                <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                <stringProp name="Argument.name">endDate</stringProp>
//	                <stringProp name="Argument.value">${__timeShift(yyyy-MM-dd,,-PD,,)}</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_chat_session_per_month?</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="GetDiaryHistoryChatSessionsConversation" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments">
//	              <elementProp name="sessionDate" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	                <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                <stringProp name="Argument.name">sessionDate</stringProp>
//	                <stringProp name="Argument.value">${__timeShift(yyyy-MM-dd,,-PD,,)}</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_chat_session_conversation?</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Resource Alerts" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments"/>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_alerts</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Resource User Journal" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments"/>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_user_journal</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Resource Facing Fear List" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments"/>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_facing_fears_list</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Resource Feedback Questions" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments">
//	              <elementProp name="isfear" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	                <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                <stringProp name="Argument.name">isfear</stringProp>
//	                <stringProp name="Argument.value">True</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_feedback_questions?</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="ResourceAlerts" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">true</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments">
//	            <collectionProp name="Arguments.arguments">
//	              <elementProp name="" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.value">{&#xd;
//	    &quot;obstacles&quot;: &quot;Mjg&quot;,&#xd;
//	    &quot;scheduledForDatetime&quot;: &#xd;
//	        [&quot;2024-1-14 09:54:00&quot;]&#xd;
//	    ,&#xd;
//	    &quot;activityID&quot;: 105,&#xd;
//	    &quot;overcomeObstacles&quot;: &quot;Lkg&quot;,&#xd;
//	    &quot;activityTitle&quot;: &quot;Other&quot;,&#xd;
//	    &quot;isMeaningful&quot;: &quot;Very much&quot;,&#xd;
//	    &quot;activityOccurrenceFrequency&quot;: &quot;Once a week&quot;,&#xd;
//	    &quot;groupID&quot;: 5,&#xd;
//	    &quot;scaleValue&quot;: 4&#xd;
//	}</stringProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_alerts</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Resource Facing Fear List" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments"/>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_facing_fears_list</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get feedback questions - For Fear" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">true</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments">
//	            <collectionProp name="Arguments.arguments">
//	              <elementProp name="" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.value">{&#xd;
//	    &quot;activityID&quot;: 1,&#xd;
//	    &quot;activityTitle&quot;: &quot;Watch educational videos about spiders to understand their behavior and debunk myths.&quot;,&#xd;
//	    &quot;groupID&quot;: 1&#xd;
//	}</stringProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_feedback_questions?isfear=True</stringProp>
//	          <stringProp name="HTTPSampler.method">POST</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="GetSelectedFearsList" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments"/>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_user_selected_fears</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get_getactivegroupactivities_ForFear" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments">
//	              <elementProp name="groupId" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	                <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                <stringProp name="Argument.name">groupId</stringProp>
//	                <stringProp name="Argument.value">${__Random(1,90)}</stringProp>
//	              </elementProp>
//	              <elementProp name="isfear" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	                <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                <stringProp name="Argument.name">isfear</stringProp>
//	                <stringProp name="Argument.value">True</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_getactive_group_activities?</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get_getbetterfollowupquestions_ForFear" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments"/>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_better_followup_questions?isfear=True</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get_ResourceFeatureSettings" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments"/>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_features_settings</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	      </hashTree>
//	      <ResultCollector guiclass="StatVisualizer" testclass="ResultCollector" testname="Aggregate Report" enabled="true">
//	        <boolProp name="ResultCollector.error_logging">false</boolProp>
//	        <objProp>
//	          <name>saveConfig</name>
//	          <value class="SampleSaveConfiguration">
//	            <time>true</time>
//	            <latency>true</latency>
//	            <timestamp>true</timestamp>
//	            <success>true</success>
//	            <label>true</label>
//	            <code>true</code>
//	            <message>true</message>
//	            <threadName>true</threadName>
//	            <dataType>true</dataType>
//	            <encoding>false</encoding>
//	            <assertions>true</assertions>
//	            <subresults>true</subresults>
//	            <responseData>false</responseData>
//	            <samplerData>false</samplerData>
//	            <xml>false</xml>
//	            <fieldNames>true</fieldNames>
//	            <responseHeaders>false</responseHeaders>
//	            <requestHeaders>false</requestHeaders>
//	            <responseDataOnError>false</responseDataOnError>
//	            <saveAssertionResultsFailureMessage>true</saveAssertionResultsFailureMessage>
//	            <assertionsResultsToSave>0</assertionsResultsToSave>
//	            <bytes>true</bytes>
//	            <sentBytes>true</sentBytes>
//	            <url>true</url>
//	            <threadCounts>true</threadCounts>
//	            <idleTime>true</idleTime>
//	            <connectTime>true</connectTime>
//	          </value>
//	        </objProp>
//	        <stringProp name="filename">C:\Users\Suraj_A\apache-jmeter-5.6.2\output_50_users_result.jtl</stringProp>
//	      </ResultCollector>
//	      <hashTree/>
//	      <ResultCollector guiclass="GraphVisualizer" testclass="ResultCollector" testname="Graph Results" enabled="false">
//	        <boolProp name="ResultCollector.error_logging">false</boolProp>
//	        <objProp>
//	          <name>saveConfig</name>
//	          <value class="SampleSaveConfiguration">
//	            <time>true</time>
//	            <latency>true</latency>
//	            <timestamp>true</timestamp>
//	            <success>true</success>
//	            <label>true</label>
//	            <code>true</code>
//	            <message>true</message>
//	            <threadName>true</threadName>
//	            <dataType>true</dataType>
//	            <encoding>false</encoding>
//	            <assertions>true</assertions>
//	            <subresults>true</subresults>
//	            <responseData>false</responseData>
//	            <samplerData>false</samplerData>
//	            <xml>false</xml>
//	            <fieldNames>true</fieldNames>
//	            <responseHeaders>false</responseHeaders>
//	            <requestHeaders>false</requestHeaders>
//	            <responseDataOnError>false</responseDataOnError>
//	            <saveAssertionResultsFailureMessage>true</saveAssertionResultsFailureMessage>
//	            <assertionsResultsToSave>0</assertionsResultsToSave>
//	            <bytes>true</bytes>
//	            <sentBytes>true</sentBytes>
//	            <url>true</url>
//	            <threadCounts>true</threadCounts>
//	            <idleTime>true</idleTime>
//	            <connectTime>true</connectTime>
//	          </value>
//	        </objProp>
//	        <stringProp name="filename"></stringProp>
//	      </ResultCollector>
//	      <hashTree/>
//	      <ResultCollector guiclass="ViewResultsFullVisualizer" testclass="ResultCollector" testname="View Results Tree" enabled="true">
//	        <boolProp name="ResultCollector.error_logging">false</boolProp>
//	        <objProp>
//	          <name>saveConfig</name>
//	          <value class="SampleSaveConfiguration">
//	            <time>true</time>
//	            <latency>true</latency>
//	            <timestamp>true</timestamp>
//	            <success>true</success>
//	            <label>true</label>
//	            <code>true</code>
//	            <message>true</message>
//	            <threadName>true</threadName>
//	            <dataType>true</dataType>
//	            <encoding>false</encoding>
//	            <assertions>true</assertions>
//	            <subresults>true</subresults>
//	            <responseData>false</responseData>
//	            <samplerData>false</samplerData>
//	            <xml>false</xml>
//	            <fieldNames>true</fieldNames>
//	            <responseHeaders>false</responseHeaders>
//	            <requestHeaders>false</requestHeaders>
//	            <responseDataOnError>false</responseDataOnError>
//	            <saveAssertionResultsFailureMessage>true</saveAssertionResultsFailureMessage>
//	            <assertionsResultsToSave>0</assertionsResultsToSave>
//	            <bytes>true</bytes>
//	            <sentBytes>true</sentBytes>
//	            <url>true</url>
//	            <threadCounts>true</threadCounts>
//	            <idleTime>true</idleTime>
//	            <connectTime>true</connectTime>
//	          </value>
//	        </objProp>
//	        <stringProp name="filename"></stringProp>
//	      </ResultCollector>
//	      <hashTree/>
//	      <ResultCollector guiclass="TableVisualizer" testclass="ResultCollector" testname="View Results in Table" enabled="true">
//	        <boolProp name="ResultCollector.error_logging">false</boolProp>
//	        <objProp>
//	          <name>saveConfig</name>
//	          <value class="SampleSaveConfiguration">
//	            <time>true</time>
//	            <latency>true</latency>
//	            <timestamp>true</timestamp>
//	            <success>true</success>
//	            <label>true</label>
//	            <code>true</code>
//	            <message>true</message>
//	            <threadName>true</threadName>
//	            <dataType>true</dataType>
//	            <encoding>false</encoding>
//	            <assertions>true</assertions>
//	            <subresults>true</subresults>
//	            <responseData>false</responseData>
//	            <samplerData>false</samplerData>
//	            <xml>false</xml>
//	            <fieldNames>true</fieldNames>
//	            <responseHeaders>false</responseHeaders>
//	            <requestHeaders>false</requestHeaders>
//	            <responseDataOnError>false</responseDataOnError>
//	            <saveAssertionResultsFailureMessage>true</saveAssertionResultsFailureMessage>
//	            <assertionsResultsToSave>0</assertionsResultsToSave>
//	            <bytes>true</bytes>
//	            <sentBytes>true</sentBytes>
//	            <url>true</url>
//	            <threadCounts>true</threadCounts>
//	            <idleTime>true</idleTime>
//	            <connectTime>true</connectTime>
//	          </value>
//	        </objProp>
//	        <stringProp name="filename"></stringProp>
//	      </ResultCollector>
//	      <hashTree/>
//	      <ThreadGroup guiclass="ThreadGroupGui" testclass="ThreadGroup" testname="Thread Group - Testing" enabled="false">
//	        <stringProp name="ThreadGroup.on_sample_error">continue</stringProp>
//	        <elementProp name="ThreadGroup.main_controller" elementType="LoopController" guiclass="LoopControlPanel" testclass="LoopController" testname="Loop Controller" enabled="true">
//	          <stringProp name="LoopController.loops">1</stringProp>
//	          <boolProp name="LoopController.continue_forever">false</boolProp>
//	        </elementProp>
//	        <stringProp name="ThreadGroup.num_threads">1</stringProp>
//	        <stringProp name="ThreadGroup.ramp_time">20</stringProp>
//	        <boolProp name="ThreadGroup.delayedStart">false</boolProp>
//	        <boolProp name="ThreadGroup.scheduler">false</boolProp>
//	        <stringProp name="ThreadGroup.duration"></stringProp>
//	        <stringProp name="ThreadGroup.delay"></stringProp>
//	        <boolProp name="ThreadGroup.same_user_on_next_iteration">false</boolProp>
//	      </ThreadGroup>
//	      <hashTree>
//	        <ResultCollector guiclass="ViewResultsFullVisualizer" testclass="ResultCollector" testname="View Results Tree" enabled="true">
//	          <boolProp name="ResultCollector.error_logging">false</boolProp>
//	          <objProp>
//	            <name>saveConfig</name>
//	            <value class="SampleSaveConfiguration">
//	              <time>false</time>
//	              <latency>false</latency>
//	              <timestamp>false</timestamp>
//	              <success>false</success>
//	              <label>false</label>
//	              <code>false</code>
//	              <message>true</message>
//	              <threadName>false</threadName>
//	              <dataType>false</dataType>
//	              <encoding>false</encoding>
//	              <assertions>false</assertions>
//	              <subresults>false</subresults>
//	              <responseData>true</responseData>
//	              <samplerData>false</samplerData>
//	              <xml>false</xml>
//	              <fieldNames>false</fieldNames>
//	              <responseHeaders>false</responseHeaders>
//	              <requestHeaders>false</requestHeaders>
//	              <responseDataOnError>false</responseDataOnError>
//	              <saveAssertionResultsFailureMessage>false</saveAssertionResultsFailureMessage>
//	              <assertionsResultsToSave>0</assertionsResultsToSave>
//	            </value>
//	          </objProp>
//	          <stringProp name="filename">C:\Users\Suraj_A\test.xml</stringProp>
//	        </ResultCollector>
//	        <hashTree/>
//	        <ResultCollector guiclass="TableVisualizer" testclass="ResultCollector" testname="View Results in Table" enabled="true">
//	          <boolProp name="ResultCollector.error_logging">false</boolProp>
//	          <objProp>
//	            <name>saveConfig</name>
//	            <value class="SampleSaveConfiguration">
//	              <time>true</time>
//	              <latency>true</latency>
//	              <timestamp>true</timestamp>
//	              <success>true</success>
//	              <label>true</label>
//	              <code>true</code>
//	              <message>true</message>
//	              <threadName>true</threadName>
//	              <dataType>true</dataType>
//	              <encoding>false</encoding>
//	              <assertions>true</assertions>
//	              <subresults>true</subresults>
//	              <responseData>false</responseData>
//	              <samplerData>false</samplerData>
//	              <xml>false</xml>
//	              <fieldNames>true</fieldNames>
//	              <responseHeaders>false</responseHeaders>
//	              <requestHeaders>false</requestHeaders>
//	              <responseDataOnError>false</responseDataOnError>
//	              <saveAssertionResultsFailureMessage>true</saveAssertionResultsFailureMessage>
//	              <assertionsResultsToSave>0</assertionsResultsToSave>
//	              <bytes>true</bytes>
//	              <sentBytes>true</sentBytes>
//	              <url>true</url>
//	              <threadCounts>true</threadCounts>
//	              <idleTime>true</idleTime>
//	              <connectTime>true</connectTime>
//	            </value>
//	          </objProp>
//	          <stringProp name="filename"></stringProp>
//	        </ResultCollector>
//	        <hashTree/>
//	        <ResultCollector guiclass="StatVisualizer" testclass="ResultCollector" testname="Aggregate Report" enabled="true">
//	          <boolProp name="ResultCollector.error_logging">false</boolProp>
//	          <objProp>
//	            <name>saveConfig</name>
//	            <value class="SampleSaveConfiguration">
//	              <time>true</time>
//	              <latency>true</latency>
//	              <timestamp>true</timestamp>
//	              <success>true</success>
//	              <label>true</label>
//	              <code>true</code>
//	              <message>true</message>
//	              <threadName>true</threadName>
//	              <dataType>true</dataType>
//	              <encoding>false</encoding>
//	              <assertions>true</assertions>
//	              <subresults>true</subresults>
//	              <responseData>false</responseData>
//	              <samplerData>false</samplerData>
//	              <xml>false</xml>
//	              <fieldNames>true</fieldNames>
//	              <responseHeaders>false</responseHeaders>
//	              <requestHeaders>false</requestHeaders>
//	              <responseDataOnError>false</responseDataOnError>
//	              <saveAssertionResultsFailureMessage>true</saveAssertionResultsFailureMessage>
//	              <assertionsResultsToSave>0</assertionsResultsToSave>
//	              <bytes>true</bytes>
//	              <sentBytes>true</sentBytes>
//	              <url>true</url>
//	              <threadCounts>true</threadCounts>
//	              <idleTime>true</idleTime>
//	              <connectTime>true</connectTime>
//	            </value>
//	          </objProp>
//	          <stringProp name="filename"></stringProp>
//	        </ResultCollector>
//	        <hashTree/>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Get Better - Create Activity" enabled="false">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="ScheduleActivity" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">true</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments">
//	              <collectionProp name="Arguments.arguments">
//	                <elementProp name="" elementType="HTTPArgument">
//	                  <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                  <stringProp name="Argument.value">{&#xd;
//	    &quot;obstacles&quot;: &quot;Mjg&quot;,&#xd;
//	    &quot;scheduledForDatetime&quot;: &#xd;
//	        [&quot;${ScheduledDate}&quot;]&#xd;
//	    ,&#xd;
//	    &quot;activityID&quot;: ${activityId},&#xd;
//	    &quot;overcomeObstacles&quot;: &quot;Lkg&quot;,&#xd;
//	    &quot;activityTitle&quot;: &quot;${activityTitle}&quot;,&#xd;
//	    &quot;isMeaningful&quot;: &quot;Very much&quot;,&#xd;
//	    &quot;activityOccurrenceFrequency&quot;: &quot;Once a week&quot;,&#xd;
//	    &quot;groupID&quot;: ${groupId},&#xd;
//	    &quot;scaleValue&quot;: 4&#xd;
//	}</stringProp>
//	                  <stringProp name="Argument.metadata">=</stringProp>
//	                </elementProp>
//	              </collectionProp>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_user_scheduling_activity</stringProp>
//	            <stringProp name="HTTPSampler.method">POST</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion - Message" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="1898135705">Successfully uploaded</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_data</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">2</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	          <UserParameters guiclass="UserParametersGui" testclass="UserParameters" testname="User Parameters" enabled="true">
//	            <collectionProp name="UserParameters.names">
//	              <stringProp name="-1815005733">ScheduledDate</stringProp>
//	              <stringProp name="-960620687">NewOccurrence</stringProp>
//	            </collectionProp>
//	            <collectionProp name="UserParameters.thread_values">
//	              <collectionProp name="-1723333903">
//	                <stringProp name="632140874">${__time(yyyy-MM-dd&apos;T&apos;hh:mm:ss)}</stringProp>
//	                <stringProp name="65793529">Daily</stringProp>
//	              </collectionProp>
//	            </collectionProp>
//	            <boolProp name="UserParameters.per_iteration">false</boolProp>
//	          </UserParameters>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Get Better - Create Other Activity" enabled="true">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="CreateOtherActivity" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">true</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments">
//	              <collectionProp name="Arguments.arguments">
//	                <elementProp name="" elementType="HTTPArgument">
//	                  <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                  <stringProp name="Argument.value">{&quot;activityID&quot;: 21, &quot;groupID&quot;: 1, &quot;activityTitle&quot;: &quot;Wednesday Testing Dialy12&quot;}</stringProp>
//	                  <stringProp name="Argument.metadata">=</stringProp>
//	                </elementProp>
//	              </collectionProp>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_other_get_better_activity</stringProp>
//	            <stringProp name="HTTPSampler.method">POST</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion - Message" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="1898135705">Successfully uploaded</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_data</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">2</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	            <JSONPostProcessor guiclass="JSONPostProcessorGui" testclass="JSONPostProcessor" testname="JSON Extractor" enabled="true">
//	              <stringProp name="JSONPostProcessor.referenceNames">createdDate</stringProp>
//	              <stringProp name="JSONPostProcessor.jsonPathExprs">$.responseData.createdDate</stringProp>
//	              <stringProp name="JSONPostProcessor.match_numbers"></stringProp>
//	            </JSONPostProcessor>
//	            <hashTree/>
//	          </hashTree>
//	          <UserParameters guiclass="UserParametersGui" testclass="UserParameters" testname="User Parameters" enabled="true">
//	            <collectionProp name="UserParameters.names">
//	              <stringProp name="-1815005733">ScheduledDate</stringProp>
//	              <stringProp name="-960620687">NewOccurrence</stringProp>
//	            </collectionProp>
//	            <collectionProp name="UserParameters.thread_values">
//	              <collectionProp name="-1723333903">
//	                <stringProp name="632140874">${__time(yyyy-MM-dd&apos;T&apos;hh:mm:ss)}</stringProp>
//	                <stringProp name="65793529">Daily</stringProp>
//	              </collectionProp>
//	            </collectionProp>
//	            <boolProp name="UserParameters.per_iteration">false</boolProp>
//	          </UserParameters>
//	          <hashTree/>
//	          <ConstantTimer guiclass="ConstantTimerGui" testclass="ConstantTimer" testname="Constant Timer" enabled="false">
//	            <stringProp name="ConstantTimer.delay">50000</stringProp>
//	          </ConstantTimer>
//	          <hashTree/>
//	          <ConstantTimer guiclass="ConstantTimerGui" testclass="ConstantTimer" testname="Constant Timer" enabled="false">
//	            <stringProp name="ConstantTimer.delay">600000</stringProp>
//	          </ConstantTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Get Better - Update Other Activity" enabled="false">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="UpdateOtherActivity" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">true</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments">
//	              <collectionProp name="Arguments.arguments">
//	                <elementProp name="" elementType="HTTPArgument">
//	                  <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                  <stringProp name="Argument.value">{&#xd;
//	    &quot;prevActivityTitle&quot;: &quot;Wednesday Testing Dialy1&quot;,&#xd;
//	    &quot;activityID&quot;: 21,&#xd;
//	    &quot;groupID&quot;: 1,&#xd;
//	    &quot;activityTitle&quot;: &quot;January Testing Dialy&quot;,&#xd;
//	    &quot;prevCreatedDate&quot;: &quot;${createdDate}&quot;&#xd;
//	}</stringProp>
//	                  <stringProp name="Argument.metadata">=</stringProp>
//	                </elementProp>
//	              </collectionProp>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_other_get_better_activity</stringProp>
//	            <stringProp name="HTTPSampler.method">POST</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion - Message" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="1898135705">Successfully uploaded</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_data</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">2</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	            <JSONPostProcessor guiclass="JSONPostProcessorGui" testclass="JSONPostProcessor" testname="JSON Extractor" enabled="true">
//	              <stringProp name="JSONPostProcessor.referenceNames">createdDate</stringProp>
//	              <stringProp name="JSONPostProcessor.jsonPathExprs">$.responseData.createdDate</stringProp>
//	              <stringProp name="JSONPostProcessor.match_numbers"></stringProp>
//	            </JSONPostProcessor>
//	            <hashTree/>
//	          </hashTree>
//	          <UserParameters guiclass="UserParametersGui" testclass="UserParameters" testname="User Parameters" enabled="true">
//	            <collectionProp name="UserParameters.names">
//	              <stringProp name="-1815005733">ScheduledDate</stringProp>
//	              <stringProp name="-960620687">NewOccurrence</stringProp>
//	            </collectionProp>
//	            <collectionProp name="UserParameters.thread_values">
//	              <collectionProp name="-1723333903">
//	                <stringProp name="632140874">${__time(yyyy-MM-dd&apos;T&apos;hh:mm:ss)}</stringProp>
//	                <stringProp name="65793529">Daily</stringProp>
//	              </collectionProp>
//	            </collectionProp>
//	            <boolProp name="UserParameters.per_iteration">false</boolProp>
//	          </UserParameters>
//	          <hashTree/>
//	          <ConstantTimer guiclass="ConstantTimerGui" testclass="ConstantTimer" testname="Constant Timer" enabled="true">
//	            <stringProp name="ConstantTimer.delay">50000</stringProp>
//	          </ConstantTimer>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Get Better - Delete Activity" enabled="false">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="DeleteActivity" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">true</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments">
//	              <collectionProp name="Arguments.arguments">
//	                <elementProp name="" elementType="HTTPArgument">
//	                  <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                  <stringProp name="Argument.value">{&#xd;
//	    &quot;activityOccurrenceFrequency&quot;: &quot;${NewOccurrence}&quot;,&#xd;
//	    &quot;activityID&quot;: ${activityId},&#xd;
//	    &quot;activityTitle&quot;: &quot;${activityTitle}&quot;,&#xd;
//	    &quot;groupID&quot;: ${groupId}&#xd;
//	}</stringProp>
//	                  <stringProp name="Argument.metadata">=</stringProp>
//	                </elementProp>
//	              </collectionProp>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_delete_scheduled_activity</stringProp>
//	            <stringProp name="HTTPSampler.method">DELETE</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion - Message" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="-101326144">Successfully deleted</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_data</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">2</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="ResourceAlerts" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments">
//	              <elementProp name="isfear" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	                <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                <stringProp name="Argument.name">isfear</stringProp>
//	                <stringProp name="Argument.value">True</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_feedback_questions?</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	          <BeanShellPreProcessor guiclass="TestBeanGUI" testclass="BeanShellPreProcessor" testname="BeanShell PreProcessor" enabled="true">
//	            <stringProp name="filename"></stringProp>
//	            <stringProp name="parameters"></stringProp>
//	            <boolProp name="resetInterpreter">false</boolProp>
//	            <stringProp name="script">import java.text.SimpleDateFormat;
//
//	// randomize DOB
//	int rndMonth = ${__Random(1,12)};
//	int rndDay = ${__Random(1,28)};
//	int rndYear = ${__Random(2022,2023)};
//	String rndDob = rndMonth + &quot;/&quot; + rndDay + &quot;/&quot; + rndYear;
//	SimpleDateFormat source = new SimpleDateFormat(&quot;mm/dd/yyyy&quot;);
//	SimpleDateFormat target = new SimpleDateFormat(&quot;yyyy-mm-dd&quot;);
//	Date date = source.parse(rndDob);
//	// convert to yyyy-mm-dd format
//	String RNDDOB = target.format(date);
//	log.info(&quot;Date is = &quot; + RNDDOB);</stringProp>
//	          </BeanShellPreProcessor>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="GetDiaryHistoryChatSessionsPerMonthCount" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments">
//	              <elementProp name="startDate" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	                <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                <stringProp name="Argument.name">startDate</stringProp>
//	                <stringProp name="Argument.value">${__Random(2022,2023)}-${__Random(1,11)}-${__Random(1,30)}</stringProp>
//	              </elementProp>
//	              <elementProp name="endDate" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	                <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                <stringProp name="Argument.name">endDate</stringProp>
//	                <stringProp name="Argument.value">${__timeShift(yyyy-MM-dd,,-PD,,)}</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_chat_session_per_month?</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get_UserActiveActivity_ForFear" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">true</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments">
//	            <collectionProp name="Arguments.arguments">
//	              <elementProp name="" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.value">{&#xd;
//	    &quot;phi_sentence&quot;: &quot;Year ${__Random(1900,2022)} Negative sentiment towards ${test} who is having SSN 234-235-234 and phone number 6132345678 and cardnumber 2344-5664-2345 \n No root issues identified in this entry.\n The worst topic appears to be the user hatred towards their friend, ${test}.\n Yes, the issue is bothering the user.\n There is no indication of how long the issue has been going on.\n The severity of the issue is not clear.\n Yes, the user wants help with this issue.\n The user has not indicated if they have sought help or taken any steps to address the issue.&quot;,&#xd;
//	    &quot;max_new_tokens&quot;: 200,&#xd;
//	    &quot;model&quot;: &quot;precise&quot;&#xd;
//	}</stringProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">dairyapi.syrahealth.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">phi_redaction_2</stringProp>
//	          <stringProp name="HTTPSampler.method">POST</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion - Name" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="1222031284">${test}</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_message</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">6</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	          <HeaderManager guiclass="HeaderPanel" testclass="HeaderManager" testname="HTTP Header Manager" enabled="true">
//	            <collectionProp name="HeaderManager.headers">
//	              <elementProp name="" elementType="Header">
//	                <stringProp name="Header.name">accept</stringProp>
//	                <stringProp name="Header.value">application/json</stringProp>
//	              </elementProp>
//	              <elementProp name="" elementType="Header">
//	                <stringProp name="Header.name">Content-Type</stringProp>
//	                <stringProp name="Header.value">application/json</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </HeaderManager>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Home - Initial Screen" enabled="false">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">false</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Profile Details" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_profile_details</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Dashboard Details" enabled="true">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments"/>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_dashboard_details</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	            <stringProp name="HTTPSampler.implementation">HttpClient4</stringProp>
//	            <stringProp name="TestPlan.comments">Created from cURL on 2023-11-10T12:22:26.9844466</stringProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <RegexExtractor guiclass="RegexExtractorGui" testclass="RegexExtractor" testname="Regular Expression Extractor" enabled="false">
//	              <stringProp name="RegexExtractor.useHeaders">false</stringProp>
//	              <boolProp name="RegexExtractor.default_empty_value">false</boolProp>
//	            </RegexExtractor>
//	            <hashTree/>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	      </hashTree>
//	      <ThreadGroup guiclass="ThreadGroupGui" testclass="ThreadGroup" testname="Thread Group - Testing1" enabled="false">
//	        <stringProp name="ThreadGroup.on_sample_error">continue</stringProp>
//	        <elementProp name="ThreadGroup.main_controller" elementType="LoopController" guiclass="LoopControlPanel" testclass="LoopController" testname="Loop Controller" enabled="true">
//	          <stringProp name="LoopController.loops">1</stringProp>
//	          <boolProp name="LoopController.continue_forever">false</boolProp>
//	        </elementProp>
//	        <stringProp name="ThreadGroup.num_threads">1</stringProp>
//	        <stringProp name="ThreadGroup.ramp_time"></stringProp>
//	        <boolProp name="ThreadGroup.delayedStart">false</boolProp>
//	        <boolProp name="ThreadGroup.scheduler">false</boolProp>
//	        <stringProp name="ThreadGroup.duration"></stringProp>
//	        <stringProp name="ThreadGroup.delay"></stringProp>
//	        <boolProp name="ThreadGroup.same_user_on_next_iteration">true</boolProp>
//	      </ThreadGroup>
//	      <hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get Resource Facing Fear List" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments"/>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_facing_fears_list</stringProp>
//	          <stringProp name="HTTPSampler.method">POST</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Post - Resource Journal" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">true</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments">
//	            <collectionProp name="Arguments.arguments">
//	              <elementProp name="" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.value">{&#xd;
//	    &quot;chatText&quot;: &quot;9WUKfPcbAm44t2LZeh0Q11gUaC4n134V+TMO7TSJ4tlOZuHNKpR1nBpHsf5Y7IBiUDX0XXQv6qqtYUXQk6d1nA==&quot;,&#xd;
//	    &quot;sessionActive&quot;: true,&#xd;
//	    &quot;newSession&quot;: true,&#xd;
//	    &quot;isJournal&quot;:true&#xd;
//	}</stringProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_user_dairy_chat</stringProp>
//	          <stringProp name="HTTPSampler.method">POST</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree/>
//	        <ResultCollector guiclass="TableVisualizer" testclass="ResultCollector" testname="View Results in Table" enabled="true">
//	          <boolProp name="ResultCollector.error_logging">false</boolProp>
//	          <objProp>
//	            <name>saveConfig</name>
//	            <value class="SampleSaveConfiguration">
//	              <time>true</time>
//	              <latency>true</latency>
//	              <timestamp>true</timestamp>
//	              <success>true</success>
//	              <label>true</label>
//	              <code>true</code>
//	              <message>true</message>
//	              <threadName>true</threadName>
//	              <dataType>true</dataType>
//	              <encoding>false</encoding>
//	              <assertions>true</assertions>
//	              <subresults>true</subresults>
//	              <responseData>false</responseData>
//	              <samplerData>false</samplerData>
//	              <xml>false</xml>
//	              <fieldNames>true</fieldNames>
//	              <responseHeaders>false</responseHeaders>
//	              <requestHeaders>false</requestHeaders>
//	              <responseDataOnError>false</responseDataOnError>
//	              <saveAssertionResultsFailureMessage>true</saveAssertionResultsFailureMessage>
//	              <assertionsResultsToSave>0</assertionsResultsToSave>
//	              <bytes>true</bytes>
//	              <sentBytes>true</sentBytes>
//	              <url>true</url>
//	              <threadCounts>true</threadCounts>
//	              <idleTime>true</idleTime>
//	              <connectTime>true</connectTime>
//	            </value>
//	          </objProp>
//	          <stringProp name="filename"></stringProp>
//	        </ResultCollector>
//	        <hashTree/>
//	        <ResultCollector guiclass="ViewResultsFullVisualizer" testclass="ResultCollector" testname="View Results Tree" enabled="true">
//	          <boolProp name="ResultCollector.error_logging">false</boolProp>
//	          <objProp>
//	            <name>saveConfig</name>
//	            <value class="SampleSaveConfiguration">
//	              <time>false</time>
//	              <latency>false</latency>
//	              <timestamp>false</timestamp>
//	              <success>false</success>
//	              <label>false</label>
//	              <code>false</code>
//	              <message>true</message>
//	              <threadName>false</threadName>
//	              <dataType>false</dataType>
//	              <encoding>false</encoding>
//	              <assertions>false</assertions>
//	              <subresults>false</subresults>
//	              <responseData>true</responseData>
//	              <samplerData>false</samplerData>
//	              <xml>false</xml>
//	              <fieldNames>false</fieldNames>
//	              <responseHeaders>false</responseHeaders>
//	              <requestHeaders>false</requestHeaders>
//	              <responseDataOnError>false</responseDataOnError>
//	              <saveAssertionResultsFailureMessage>false</saveAssertionResultsFailureMessage>
//	              <assertionsResultsToSave>0</assertionsResultsToSave>
//	            </value>
//	          </objProp>
//	          <stringProp name="filename">C:\Users\Suraj_A\test.xml</stringProp>
//	        </ResultCollector>
//	        <hashTree/>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="ResourceAlerts" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments">
//	              <elementProp name="isfear" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	                <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                <stringProp name="Argument.name">isfear</stringProp>
//	                <stringProp name="Argument.value">True</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_feedback_questions?</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	          <BeanShellPreProcessor guiclass="TestBeanGUI" testclass="BeanShellPreProcessor" testname="BeanShell PreProcessor" enabled="true">
//	            <stringProp name="filename"></stringProp>
//	            <stringProp name="parameters"></stringProp>
//	            <boolProp name="resetInterpreter">false</boolProp>
//	            <stringProp name="script">import java.text.SimpleDateFormat;
//
//	// randomize DOB
//	int rndMonth = ${__Random(1,12)};
//	int rndDay = ${__Random(1,28)};
//	int rndYear = ${__Random(2022,2023)};
//	String rndDob = rndMonth + &quot;/&quot; + rndDay + &quot;/&quot; + rndYear;
//	SimpleDateFormat source = new SimpleDateFormat(&quot;mm/dd/yyyy&quot;);
//	SimpleDateFormat target = new SimpleDateFormat(&quot;yyyy-mm-dd&quot;);
//	Date date = source.parse(rndDob);
//	// convert to yyyy-mm-dd format
//	String RNDDOB = target.format(date);
//	log.info(&quot;Date is = &quot; + RNDDOB);</stringProp>
//	          </BeanShellPreProcessor>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="GetDiaryHistoryChatSessionsPerMonthCount" enabled="true">
//	          <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	            <collectionProp name="Arguments.arguments">
//	              <elementProp name="startDate" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	                <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                <stringProp name="Argument.name">startDate</stringProp>
//	                <stringProp name="Argument.value">${__Random(2022,2023)}-${__Random(1,11)}-${__Random(1,30)}</stringProp>
//	              </elementProp>
//	              <elementProp name="endDate" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	                <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                <stringProp name="Argument.name">endDate</stringProp>
//	                <stringProp name="Argument.value">${__timeShift(yyyy-MM-dd,,,)}</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">/${base}/resource_get_chat_session_per_month?</stringProp>
//	          <stringProp name="HTTPSampler.method">GET</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	        </hashTree>
//	        <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="Get_UserActiveActivity_ForFear" enabled="false">
//	          <boolProp name="HTTPSampler.postBodyRaw">true</boolProp>
//	          <elementProp name="HTTPsampler.Arguments" elementType="Arguments">
//	            <collectionProp name="Arguments.arguments">
//	              <elementProp name="" elementType="HTTPArgument">
//	                <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                <stringProp name="Argument.value">{&#xd;
//	    &quot;phi_sentence&quot;: &quot;Year ${__Random(1900,2022)} Negative sentiment towards ${test} who is having SSN 234-235-234 and phone number 6132345678 and cardnumber 2344-5664-2345 \n No root issues identified in this entry.\n The worst topic appears to be the user hatred towards their friend, ${test}.\n Yes, the issue is bothering the user.\n There is no indication of how long the issue has been going on.\n The severity of the issue is not clear.\n Yes, the user wants help with this issue.\n The user has not indicated if they have sought help or taken any steps to address the issue.&quot;,&#xd;
//	    &quot;max_new_tokens&quot;: 200,&#xd;
//	    &quot;model&quot;: &quot;precise&quot;&#xd;
//	}</stringProp>
//	                <stringProp name="Argument.metadata">=</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </elementProp>
//	          <stringProp name="HTTPSampler.domain">dairyapi.syrahealth.com</stringProp>
//	          <stringProp name="HTTPSampler.protocol">https</stringProp>
//	          <stringProp name="HTTPSampler.path">phi_redaction_2</stringProp>
//	          <stringProp name="HTTPSampler.method">POST</stringProp>
//	          <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	          <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	          <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	          <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	          <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	          <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	          <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	          <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	          <boolProp name="HTTPSampler.md5">false</boolProp>
//	          <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	        </HTTPSamplerProxy>
//	        <hashTree>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="49586">200</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">1</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	          <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion - Name" enabled="true">
//	            <collectionProp name="Asserion.test_strings">
//	              <stringProp name="1222031284">${test}</stringProp>
//	            </collectionProp>
//	            <stringProp name="Assertion.custom_message"></stringProp>
//	            <stringProp name="Assertion.test_field">Assertion.response_message</stringProp>
//	            <boolProp name="Assertion.assume_success">false</boolProp>
//	            <intProp name="Assertion.test_type">6</intProp>
//	          </ResponseAssertion>
//	          <hashTree/>
//	          <HeaderManager guiclass="HeaderPanel" testclass="HeaderManager" testname="HTTP Header Manager" enabled="true">
//	            <collectionProp name="HeaderManager.headers">
//	              <elementProp name="" elementType="Header">
//	                <stringProp name="Header.name">accept</stringProp>
//	                <stringProp name="Header.value">application/json</stringProp>
//	              </elementProp>
//	              <elementProp name="" elementType="Header">
//	                <stringProp name="Header.name">Content-Type</stringProp>
//	                <stringProp name="Header.value">application/json</stringProp>
//	              </elementProp>
//	            </collectionProp>
//	          </HeaderManager>
//	          <hashTree/>
//	        </hashTree>
//	        <TransactionController guiclass="TransactionControllerGui" testclass="TransactionController" testname="Diary - Previous Entries - Date range selected" enabled="false">
//	          <boolProp name="TransactionController.includeTimers">false</boolProp>
//	          <boolProp name="TransactionController.parent">true</boolProp>
//	        </TransactionController>
//	        <hashTree>
//	          <HTTPSamplerProxy guiclass="HttpTestSampleGui" testclass="HTTPSamplerProxy" testname="GetDiaryHistoryChatSessionsCount" enabled="false">
//	            <boolProp name="HTTPSampler.postBodyRaw">false</boolProp>
//	            <elementProp name="HTTPsampler.Arguments" elementType="Arguments" guiclass="HTTPArgumentsPanel" testclass="Arguments" enabled="true">
//	              <collectionProp name="Arguments.arguments">
//	                <elementProp name="startDate" elementType="HTTPArgument">
//	                  <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                  <stringProp name="Argument.metadata">=</stringProp>
//	                  <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                  <stringProp name="Argument.name">startDate</stringProp>
//	                  <stringProp name="Argument.value">${__timeShift(yyyy-MM-dd,,-P30D,,)}</stringProp>
//	                </elementProp>
//	                <elementProp name="endDate" elementType="HTTPArgument">
//	                  <boolProp name="HTTPArgument.always_encode">false</boolProp>
//	                  <stringProp name="Argument.metadata">=</stringProp>
//	                  <boolProp name="HTTPArgument.use_equals">true</boolProp>
//	                  <stringProp name="Argument.name">endDate</stringProp>
//	                  <stringProp name="Argument.value">${__timeShift(yyyy-MM-dd,,-PD,,)}</stringProp>
//	                </elementProp>
//	              </collectionProp>
//	            </elementProp>
//	            <stringProp name="HTTPSampler.domain">${basename}.execute-api.us-east-1.amazonaws.com</stringProp>
//	            <stringProp name="HTTPSampler.protocol">https</stringProp>
//	            <stringProp name="HTTPSampler.path">/${base}/resource_get_chat_session_per_month?</stringProp>
//	            <stringProp name="HTTPSampler.method">GET</stringProp>
//	            <boolProp name="HTTPSampler.follow_redirects">true</boolProp>
//	            <boolProp name="HTTPSampler.auto_redirects">false</boolProp>
//	            <boolProp name="HTTPSampler.use_keepalive">true</boolProp>
//	            <boolProp name="HTTPSampler.DO_MULTIPART_POST">false</boolProp>
//	            <boolProp name="HTTPSampler.BROWSER_COMPATIBLE_MULTIPART">false</boolProp>
//	            <boolProp name="HTTPSampler.image_parser">false</boolProp>
//	            <boolProp name="HTTPSampler.concurrentDwn">false</boolProp>
//	            <stringProp name="HTTPSampler.concurrentPool">6</stringProp>
//	            <boolProp name="HTTPSampler.md5">false</boolProp>
//	            <intProp name="HTTPSampler.ipSourceType">0</intProp>
//	          </HTTPSamplerProxy>
//	          <hashTree>
//	            <ResponseAssertion guiclass="AssertionGui" testclass="ResponseAssertion" testname="Response Assertion" enabled="true">
//	              <collectionProp name="Asserion.test_strings">
//	                <stringProp name="49586">200</stringProp>
//	              </collectionProp>
//	              <stringProp name="Assertion.custom_message"></stringProp>
//	              <stringProp name="Assertion.test_field">Assertion.response_code</stringProp>
//	              <boolProp name="Assertion.assume_success">false</boolProp>
//	              <intProp name="Assertion.test_type">1</intProp>
//	            </ResponseAssertion>
//	            <hashTree/>
//	          </hashTree>
//	        </hashTree>
//	      </hashTree>
//	      <HeaderManager guiclass="HeaderPanel" testclass="HeaderManager" testname="HTTP HeaderManager" enabled="true">
//	        <collectionProp name="HeaderManager.headers">
//	          <elementProp name="Authorization" elementType="Header">
//	            <stringProp name="Header.name">Authorization</stringProp>
//	            <stringProp name="Header.value">${auth}</stringProp>
//	          </elementProp>
//	        </collectionProp>
//	        <stringProp name="TestPlan.comments">Created from cURL on 2023-11-10T12:22:26.9844466</stringProp>
//	      </HeaderManager>
//	      <hashTree/>
//	      <CSVDataSet guiclass="TestBeanGUI" testclass="CSVDataSet" testname="CSV Data Set Config" enabled="true">
//	        <stringProp name="delimiter">,</stringProp>
//	        <stringProp name="fileEncoding"></stringProp>
//	        <stringProp name="filename">C:/Users/SyrenityAdmin/Desktop/TestFolder/testdata.csv</stringProp>
//	        <boolProp name="ignoreFirstLine">true</boolProp>
//	        <boolProp name="quotedData">false</boolProp>
//	        <boolProp name="recycle">true</boolProp>
//	        <stringProp name="shareMode">shareMode.thread</stringProp>
//	        <boolProp name="stopThread">false</boolProp>
//	        <stringProp name="variableNames">basename,base</stringProp>
//	      </CSVDataSet>
//	      <hashTree/>
//	      <CSVDataSet guiclass="TestBeanGUI" testclass="CSVDataSet" testname="CSV Data Set -Get Better Data" enabled="true">
//	        <stringProp name="delimiter">,</stringProp>
//	        <stringProp name="fileEncoding"></stringProp>
//	        <stringProp name="filename">C:/Users/SyrenityAdmin/Desktop/TestFolder/GetBetterData.csv</stringProp>
//	        <boolProp name="ignoreFirstLine">true</boolProp>
//	        <boolProp name="quotedData">false</boolProp>
//	        <boolProp name="recycle">true</boolProp>
//	        <stringProp name="shareMode">shareMode.group</stringProp>
//	        <boolProp name="stopThread">false</boolProp>
//	        <stringProp name="variableNames">activityId,activityTitle,groupId</stringProp>
//	      </CSVDataSet>
//	      <hashTree/>
//	      <CSVDataSet guiclass="TestBeanGUI" testclass="CSVDataSet" testname="data for chart" enabled="false">
//	        <stringProp name="filename">C:/Users/SyrenityAdmin/Desktop/data.csv</stringProp>
//	        <stringProp name="fileEncoding"></stringProp>
//	        <stringProp name="variableNames">test</stringProp>
//	        <boolProp name="ignoreFirstLine">false</boolProp>
//	        <stringProp name="delimiter">,</stringProp>
//	        <boolProp name="quotedData">false</boolProp>
//	        <boolProp name="recycle">true</boolProp>
//	        <boolProp name="stopThread">false</boolProp>
//	        <stringProp name="shareMode">shareMode.group</stringProp>
//	      </CSVDataSet>
//	      <hashTree/>
//	      <CSVDataSet guiclass="TestBeanGUI" testclass="CSVDataSet" testname="Authorization CSV Data Set Config" enabled="true">
//	        <stringProp name="filename">C:/Users/SyrenityAdmin/Desktop/TestFolder/Authorization.csv</stringProp>
//	        <stringProp name="fileEncoding"></stringProp>
//	        <stringProp name="variableNames">auth</stringProp>
//	        <boolProp name="ignoreFirstLine">false</boolProp>
//	        <stringProp name="delimiter">,</stringProp>
//	        <boolProp name="quotedData">false</boolProp>
//	        <boolProp name="recycle">true</boolProp>
//	        <boolProp name="stopThread">false</boolProp>
//	        <stringProp name="shareMode">shareMode.group</stringProp>
//	      </CSVDataSet>
//	      <hashTree/>
//	    </hashTree>
//	  </hashTree>
//	</jmeterTestPlan>
//
//
//}
