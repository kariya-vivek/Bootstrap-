<?php
	$con =mysqli_connect("localhost","root","","vk");
	echo "welcome";
	$sel=mysqli_query($con,"select * from user");
	while($row=mysqli_fetch_assoc($sel))
	{
		echo $_POST["unm"];
		echo $_POST["uemail"];
		echo $_POST["upwd"];
	}
?>