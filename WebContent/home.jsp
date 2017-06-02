<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Home</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>

<link href="jumbotron-narrow.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="header clearfix">
			<nav>
			<ul class="nav nav-pills pull-right">
				<li role="presentation" class="active"><a href="#">Home</a></li>
			</ul>
			</nav>
			<h3 class="text-muted">QA Cinema Ticket System</h3>
		</div>

		<div class="jumbotron">
			<h1>QA Cinemas</h1>
			<h2>Select a ticket type below</h2>
			<!	// ---BLOCK 1 --- This block will add a drop-down menu and fill it with ticket types, for the user to select their ticket type--!>
			<!	// each options are available for selection--!>
			<div class="form-group">
				<form action="${pageContext.request.contextPath}/submitticketaction"
					method="post">
					<select name="ticket" class="form-control">
						<option value="none">Please Select Ticket type</option>
						<option value="Standard">Standard</option>
						<option value="OAP">OAP</option>
						<option value="Student">Student</option>
						<option value="Child">Child</option>
					</select> <input type="submit" name="button" class="btn btn-default"
						value="Add ticket" />
				</form>
			</div>
			<!   // ---BLOCK 1 ---  Up to here --!>

			<p>Total cost for tickets: £${total_cost_summary}</p>
			<!-- Draw table here -->
			<br> <br> <br> <br>

			<h2>Ticket Summary</h2>
			<table class="table">
				<tr>
					<th>Ticket type</th>
					<th>Quantity</th>
				</tr>
				<tr>
					<td>Standard</td>
					<td>£8</td>
				</tr>
				<tr>
					<td>Student</td>
					<td>£6</td>
				</tr>
				<tr>
					<td>Child</td>
					<td>£4</td>
				</tr>
				<tr>
					<td>OAP</td>
					<td>£6</td>
				</tr>
			</table>
		</div>
		<footer class="footer">
		<p>&copy; 2017 QA Cinemas, Inc. Visar Quqalla</p>
		</footer>
	</div>
	<!-- /container -->
</body>
</html>
