<!DOCTYPE html>
<html>
<head>
	<title>Admin Dashboard</title>
	<link rel="stylesheet" type="text/css" href="bootstrap-4.4.1/css/bootstrap.min.css">
  	<script type="text/javascript" src="bootstrap-4.4.1/js/juqery_latest.js"></script>
  	<script type="text/javascript" src="bootstrap-4.4.1/js/bootstrap.min.js"></script>
	<style type="text/css">
		#header{
			height: 10%;
			width: 100%;
			top: 2%;
			background-color: black;
			position: fixed;
			color: white;
		}
		#left_side{
			height: 75%;
			width: 15%;
			top: 10%;
			position: fixed;
		}
		#right_side{
			height: 75%;
			width: 80%;
			background-color: whitesmoke;
			position: fixed;
			left: 17%;
			top: 21%;
			color: red;
			border: solid 1px black;
		}
		#top_span{
			top: 15%;
			width: 80%;
			left: 17%;
			position: fixed;
		}
		#td{
			border: 1px solid black;
			padding-left: 2px;
			text-align: left;
			width: 200px;
		}
	</style>
	<?php
		session_start();
		$name = "";
		$connection = mysqli_connect("localhost","root","");
		$db = mysqli_select_db($connection,"sms");
	?>
</head>
<body>
	<div id="header"><br>
		<center>Admin login System &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Email: <?php echo $_SESSION['email'];?>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Name:<?php echo $_SESSION['name'];?> 
		<a href="logout.php">Logout</a>
		</center>
	</div>
	<div id="left_side">
		<br><br><br>
		<form action="" method="post">
			<table>
				<tr>
					<td>
						<input type="submit" name="search_student" value="Search Student">
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" name="edit_student" value="Edit Student">
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" name="add_new_student" value="Add New Student">
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" name="delete_student" value="Delete Student">
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="right_side"><br><br>
		<div id="demo">
		<!-- #Code for search student---Start-->
			<?php
				if(isset($_POST['search_student']))
				{
					?>
					<center>
					<form action="" method="post">
					&nbsp;&nbsp;<b>Enter first name:</b>&nbsp;&nbsp; <input type="text" name="FirstName">
				&nbsp;&nbsp;<b>Enter last name:</b>&nbsp;&nbsp; <input type="text" name="LastNameastname">
				&nbsp;&nbsp;<b>Enter mobile number:</b>&nbsp;&nbsp; <input type="text" name="mobile">
					<input type="submit" name="search_by_FirstName_for_search" value="Search">
					</form><br><br>
					<h4><b><u>Student's details</u></b></h4><br><br>
					</center>
					<?php
				}
				if(isset($_POST['search_by_FirstName_for_search']))
				{
					$query = "select * from student where FirstName = '$_POST[FirstName]'";
					$query_run = mysqli_query($connection,$query);
					while ($row = mysqli_fetch_assoc($query_run)) 
					{
						?>
						<table>
							<tr>
								<td>
									<b>firstname:</b>
								</td> 
								<td>
									<input type="text" value="<?php echo $row['FirstName']?>" disabled>
								</td>
							</tr>
							<tr>
								<td>
									<b>lastname:</b>
								</td> 
								<td>
									<input type="text" value="<?php echo $row['LastName']?>" disabled>
								</td>
							</tr>
							<tr>
								<td>
									<b>password:</b>
								</td> 
								<td>
									<input type="text" value="<?php echo $row['password']?>" disabled>
								</td>
							</tr>
							<tr>
								<td>
									<b>mobile:</b>
								</td> 
								<td>
									<input type="tel" id="phone" name="phone" pattern="[0-9]{3}-[0-9]{2}-[0-9]{3}">
								</td>
							</tr>
							<tr>
								<td>
									<b>gender:</b>
								</td> 
								<td>
									<input type="radio" name="gender" value="male"> Male<br>
                                    <input type="radio" name="gender" value="female"> Female<br>
                                     <input type="radio" name="gender" value="other"> Other
								</td>
							</tr>
							<tr>
								<td>
									<b>Email:</b>
								</td> 
								<td>
									<input type="text" value="<?php echo $row['Email']?>" disabled>
								</td>
							</tr>
							<tr>
								<td>
									<b>Birthday:</b>
								</td> 
								<td>
									<input type="Birthday" value="<?php echo $row['Birthday']?>" disabled>
								</td>
							</tr>
							<tr>
								<td>
									<b>Qualification:</b>
								</td> 
								<td>
									<select name="Qualification" id="m_Qualification">
                                    <option value="B.Tech">B.Tech</option>
                                    <option value="MCA">MCA</option>
                                    <option value="Graduation">Graduation</option>
                                     <option value="Post-Graduation">Post-Graduation</option>
                                     <option value="MBA">MBA</option>
                                      <option value="Others">OTHERS</option>
                                      </select><br>
								</td>
							</tr>
							<tr>
								<td>
									<b>language:</b>
								</td> 
								<td>
									<textarea rows="3" cols="40" disabled><?php echo $row['language']?></textarea>
								</td>
							</tr>
							<tr>
								<td>
									<b>Description:</b>
								</td> 
								<td>
									<textarea rows="3" cols="40" disabled><?php echo $row['Description']?></textarea>
								</td>
							</tr>
						</table>
						<?php
					}
				}
			?>
		<!-- #Code for edit student details---Start-->
		<?php
			if(isset($_POST['edit_student']))
			{
				?>
				<center>
				<form action="" method="post">
				&nbsp;&nbsp;<b>Enter first name:</b>&nbsp;&nbsp; <input type="text" name="FirstName">
				&nbsp;&nbsp;<b>Enter last name:</b>&nbsp;&nbsp; <input type="text" name="LastName">
				&nbsp;&nbsp;<b>Enter mobile number:</b>&nbsp;&nbsp; <input type="text" name="mobile">
				<input type="submit" name="search_by_FirstName_for_edit" value="Search">
				</form><br><br>
				<h4><b><u>Student's details</u></b></h4><br><br>
				</center>
				<?php
			}
			if(isset($_POST['search_by_FirstName_for_edit']))
				{
					$query = "select * from student where FirstName = '$_POST[FirstName]'";
				$query_run = mysqli_query($connection,$query);
				while ($row = mysqli_fetch_assoc($query_run)) 
				{
					?>
					<form action="admin_edit_student.php" method="post">
						<table>
						<tr>
							<td>
								<b>FirstName:</b>
							</td> 
							<td>
								<input type="text" name="FirstName" value="<?php echo $row['FirstName']?>">
							</td>
						</tr>
						<tr>
							<td>
								<b>LastName:</b>
							</td> 
							<td>
								<input type="text" name="LastName" value="<?php echo $row['LastName']?>">
							</td>
						</tr>
						<tr>
							<td>
								<b>password:</b>
							</td> 
							<td>
								<input type="text" name="password" value="<?php echo $row['password']?>">
							</td>
						</tr>
						<tr>
							<td>
								<b>email:</b>
							</td> 
							<td>
								<input type="text" name="Email" value="<?php echo $row['Email']?>">
							</td>
						</tr>
						<tr>
								<td>
									<b>gender:</b>
								</td> 
								<td>
									<input type="radio" name="gender" value="male"> Male<br>
                                    <input type="radio" name="gender" value="female"> Female<br>
                                     <input type="radio" name="gender" value="other"> Other
								</td>
							</tr>
						<tr>
							<td>
								<b>Mobile:</b>
							</td> 
							<td>
								<input type="tel" id="phone" name="phone" pattern="[0-9]{3}-[0-9]{2}-[0-9]{3}">
							</td>
						</tr>
						<tr>
							<td>
								<b>Birthday:</b>
							</td> 
							<td>
								<input type="text" name="Birthday" value="<?php echo $row['Birthday']?>">
							</td>
						</tr>
						<tr>
							<td>
								<b>Qualification:</b>
							</td> 
							<td>
								<select name="Qualification" id="m_Qualification">
                                    <option value="B.Tech">B.Tech</option>
                                    <option value="MCA">MCA</option>
                                    <option value="Graduation">Graduation</option>
                                     <option value="Post-Graduation">Post-Graduation</option>
                                     <option value="MBA">MBA</option>
                                      <option value="Others">OTHERS</option>
                                      </select><br>
							</td>
						</tr>
						<tr>
								<td>
									<b>language:</b>
								</td> 
								<td>
									<input type="text" name="language" value="<?php echo $row['language']?>">
								</td>
							</tr>
						<tr>
								<td>
									<b>Description:</b>
								</td> 
								<td>
									<input type="text" name="language" rows="3" cols="40" value="<?php echo $row['Description']?>">
								</td>
							</tr>
						<tr>
							<td></td>
							<td>
								<input type="submit" name="edit" value="Save">
							</td>
						</tr>
					</table>
					</form>
					<?php
				}
			}
		?>
		<!-- #Code for Delete student details---Start-->
		<?php
			if(isset($_POST['delete_student']))
			{
				?>
				<center>
				<form action="delete_student.php" method="post">
				&nbsp;&nbsp;<b>Enter first name:</b>&nbsp;&nbsp; <input type="text" name="FirstName">
				&nbsp;&nbsp;<b>Enter last name:</b>&nbsp;&nbsp; <input type="text" name="LastName">
				&nbsp;&nbsp;<b>Enter mobile number:</b>&nbsp;&nbsp; <input type="text" name="mobile">
				<input type="submit" name="search_by_FirstName_for_delete" value="Delete">
				</form><br><br>
				</center>
				<?php
			}
			?>

			<?php 
				if(isset($_POST['add_new_student'])){
					?>
					<center><h4>Register the given details</h4></center>
					<form action="add_student.php" method="post">
						<table>
						<tr>
							<td>
								<b>FirstName:</b>
							</td> 
							<td>
								<input type="text" name="FirstName" required>
							</td>
						</tr>
						<tr>
							<td>
								<b>LastName:</b>
							</td> 
							<td>
								<input type="text" name="LastName" required>
							</td>
						</tr>
						<tr>
							<td>
								<b>password:</b>
							</td> 
							<td>
								<input type="text" name="password" required>
							</td>
						</tr>
						<tr>
							<td>
								<b>Email:</b>
							</td> 
							<td>
								<input type="text" name="Email" required>
							</td>
						</tr>
						<tr>
							<td>
								<b>Mobile:</b>
							</td> 
							<td>
								<input type="text" name="mobile" required>
							</td>
						</tr>
						<tr>
							<td>
								<b>Birthday:</b>
							</td> 
							<td>
								<input type="text" name="Birthday" required>
							</td>
						</tr>
						<tr>
							<td>
								<b>Qualifications:</b>
							</td> 
							<td>
								<input type="text" name="Qualifications" required>
							</td>
						</tr>
						<tr>
							<td>
								<b>language:</b>
							</td> 
							<td>
								<input type="text" name="language" required>
							</td>
						</tr>
						<tr>
							<td>
								<b>Description:</b>
							</td> 
							<td>
								<textarea rows="3" cols="40" placeholder="Optional" name="Description"></textarea>
						    </td>
						</tr>
						<tr>
							<td></td>
							<td><br><input type="submit" name="add" value="Add Student"></td>
						</tr>
					</table>
					</form>
					<?php
				}
			?>
		</div>
	</div>
</body>
</html>