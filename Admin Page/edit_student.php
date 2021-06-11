<?php
	$connection = mysqli_connect("localhost","root","");
	$db = mysqli_select_db($connection,"sms");
	$query = "update students set FirstName='$_POST[FirstName]',Last_name='$_POST[Last_name]',password=$_POST[password],email='$_POST[email]',mobile='$_POST[mobile]',Birthday='$_POST[Birthday]',Qalifications='$_POST[Qalifications]',language='$_POST[language]',Description='$_POST[Description]'where First_Name = $_POST[First_Name],Last_Name = $_POST[Last_Name],mobile = $_POST[mobile]";
	$query_run = mysqli_query($connection,$query);
?>
<script type="text/javascript">
	alert("Details edited successfully.");
	window.location.href = "student_dashboard.php";
</script>

