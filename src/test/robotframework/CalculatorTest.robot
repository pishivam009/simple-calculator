*** Settings ***
Library           BuiltIn
Library           OperatingSystem

*** Test Cases ***
Test Add
    Start Application and Verify Calculation    1    +    2    3

Test Subtract
    Start Application and Verify Calculation    23    -    12    11

*** Keywords ***
Start Application and Verify Calculation
    [Arguments]    ${InputNumber1}    ${Operator}    ${InputNumber2}    ${ExpectedResult}
    ${rc}    ${output}=    Run And Return Rc And Output    java -jar "target\\simple-calculator-1.0.0-SNAPSHOT.jar" ${InputNumber1} ${Operator} ${InputNumber2}
    log    CalculationResult = ${output}
    log    ReturnCode = ${rc}
    BuiltIn.Should Be Equal    ${output}    ${ExpectedResult}    ERROR: IONCalculator returned {${output}} while expected value {${ExpectedResult}}
