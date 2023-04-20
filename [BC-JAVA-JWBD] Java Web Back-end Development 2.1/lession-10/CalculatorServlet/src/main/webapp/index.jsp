<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="calculator" method="post">
    <h2>Calculator</h2>
    <label>First operand: </label>
    <input type="number" name="number_first" placeholder="0"><br/>

    <label>Operator: </label>
    <select name="operator">
        <option value="+">Addition</option>
        <option value="-">Subtraction</option>
        <option value="*">Multiplication</option>
        <option value="/">Division</option>
    </select><br/>

    <label>Second operand: </label>
    <input type="number" name="number_two" placeholder="0"><br/>
    <input type="submit" value="Calculate">
</form>
</body>
</html>