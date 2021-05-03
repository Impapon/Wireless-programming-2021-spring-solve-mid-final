# Final-Assesment-for-wireless-programming(Spring 2021) 

# Question : 
You have been asked to design an android application that will contain two activities named
LogInActivity and NextActivity. In the LogInActivity, you will have two EditText components
and one button. The First EditText component will suggest entering your name, and the second
one will suggest entering your password. The button will be named the “Login” button. If you
press the Login button, you will be moved to the NextActivity if the 3rd character of the
password is ‘w’. If the condition is not satisfied, a toast message will be generated as “Login
failed! Enter your password again!”
The NextActivity will contain a listview of three buttons named the “Calculate BMI”,
“Fahrenheit to Celsius”, and “Celsius to Fahrenheit” buttons which will be supported by
corresponding fragments.
The “Calculate BMI” fragment will contain one TextView, two EditText, and a button as
components. The TextView will show your student id. Out of the two EditText components, the
first one will suggest entering your weight in kilograms, and the second one will suggest entering
your height in meters. The button named “Calculate” will calculate the BMI as per the received
inputs. The formula of BMI to be used is,
 BMI = (weight in kg) / (height in meters) ^ 2
After clicking the “Calculate” button, the calculated result will be displayed in the toast message
according to certain conditions. If the calculated value is greater than 25, it will show the
“Overweight” message along with the score. Anything under 25 will show the “Not
Overweight” message along with the score.
The “Fahrenheit to Celsius” fragment will contain one EditText, one button, and two TextViews
as components. The EditText will suggest entering the temperature in Fahrenheit. The button
named “Calculate” will calculate the celsius of the EditText value and will set the calculated
result to the first TextView after the button click. The other TextView will show your student id.
For Fahrenheit to Celsius Conversion, you will use the following formula:
C/5 = (F-32)/9
The “Celsius to Fahrenheit” fragment will contain one EditText, one button, and two TextViews
as components. The EditText will suggest entering the temperature in celsius. The button named
“Calculate” will calculate the Fahrenheit of the EditText value and will set the calculated result
to the first TextView after the button click. The other TextView will show your student id.
