// So basically in this operators part what I learn :
 //   1. Arithmetic  Operator ( + , - , * , / , % )
 //   2. Logical / Conditional ( && , || , ?: )
 //   3. Unary ( ++ , -- , ! , + , -)
 //   4. Bitwise (& -> ^ -> |)
 //   5. BitShift ( >>(right shift) , << (left shift) , >>>)
 //   6. Assignment Operator (+=, -=, *=, /= , %= )
 //   7. Relational / Equality Operator ( <= , >= , != , == , < , > )
 //   8. The Simple Assignment Operator ( = )
 //   9. The Type comparison operator ( instanceOf )

/*
Simple Assignment Operator
=       Simple assignment operator
Arithmetic Operators
+       Additive operator (also used
        for String concatenation)
-       Subtraction operator
*       Multiplication operator
/       Division operator
%       Remainder operator
Unary Operators
+       Unary plus operator; indicates
positive value (numbers are
        positive without this, however)
-       Unary minus operator; negates
an expression
++      Increment operator; increments
a value by 1
        --      Decrement operator; decrements
a value by 1
        !       Logical complement operator;
inverts the value of a boolean
Equality and Relational Operators
==      Equal to
!=      Not equal to
>       Greater than
>=      Greater than or equal to
        <       Less than
<=      Less than or equal to
Conditional Operators
&&      Conditional-AND
||      Conditional-OR
?:      Ternary (shorthand for
        if-then-else statement)
Type Comparison Operator
instanceof      Compares an object to
a specified type
Bitwise and Bit Shift Operators
~       Unary bitwise complement
<<      Signed left shift
>>      Signed right shift
>>>     Unsigned right shift
&       Bitwise AND
^       Bitwise exclusive OR
|       Bitwise inclusive OR

 */

/*

Operators	Precedence
postfix	expr++ expr--
unary	++expr --expr +expr -expr ~ !
multiplicative	* / %
additive	+ -
shift	<< >> >>>
relational	< > <= >= instanceof
equality	== !=
bitwise AND	&
bitwise exclusive OR	^
bitwise inclusive OR	|
logical AND	&&
logical OR	||
ternary	? :
assignment	= += -= *= /= %= &= ^= |= <<= >>= >>>=

 */


public class Operators {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;
        boolean result;

//        // Expression 1
        int x = a++ + --b * c / a - b;

        // Expression 2
        result = (x < b) && (a == b) || !(c > x);
//
        // Expression 3
        int y = x ^ b & a | c;
//
//        // Expression 4
        int z = (x < 10) ? x++ : --c;
//
//        // Final Expression
//        x += y - z + (a++ * --c / b);
//
        System.out.println("Final values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("result = " + result);

        System.out.println(x);
    }
}
