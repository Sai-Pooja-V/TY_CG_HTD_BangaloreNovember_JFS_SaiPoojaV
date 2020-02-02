
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<form action="./register" method="post">
		<fieldset>
			<legend>Employee Details</legend>
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
		</fieldset>
		<fieldset>
			<legend>Employee Address Details 1</legend>
			<table>
				<tr>
					<td>Address Type:</td>
					<td><select name="addressBeans[0].addressType">
							<option>-----Select-----</option>
							<option value="permanent">Permanent</option>
							<option value="temporary">Temporary</option>
					</select></td>
				</tr>
				<tr>
					<td>Address 1:</td>
					<td><input type="text" name="addressBeans[0].address1"></td>
				</tr>
				<tr>
					<td>Address 2:</td>
					<td><input type="text" name="addressBeans[0].address2"></td>
				</tr>
			</table>
		</fieldset>
		<fieldset>
			<legend>Employee Address Details 2</legend>
			<table>
				<tr>
					<td>Address Type:</td>
					<td><select name="addressBeans[1].addressType">
							<option value="permanent">Permanent</option>
							<option value="temporary">Temporary</option>
					</select></td>
				</tr>
				<tr>
					<td>Address1:</td>
					<td><input type="text" name="addressBeans[1].address1"></td>
				</tr>
				<tr>
					<td>Address2:</td>
					<td><input type="text" name="addressBeans[1].address2"></td>
				</tr>
			</table>
		</fieldset>

		<table>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>