<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
	
	
	<script type="text/javascript">
	
	$(document).ready(function(){
		viewUser();
	})
	
	
	function addUser()
	{
		
		var uname = $('#uname').val()
		var email = $('#email').val()
		var phone = $('#phone').val()
		var pass = $('#pass').val()
	
		$.post('reg',{uname,email,phone,pass},function(rt){
			alert(rt)
			viewUser()
		})
		
	}
	
	function viewUser()
	{
		$.get('display',{},function(rt){
			var row = "";
			const data = JSON.parse(rt)
			for(var i=0;i<data.length;i++)
			{
				row = row+"<tr><td>"+data[i].id+"</td><td>"+data[i].uname+"</td><td>"+data[i].email+"</td><td>"+data[i].pass+"</td><td>"+data[i].phone+"</td><td><button class='btn btn-primary' onclick='edituser("+data[i].id+")'>Edit</button></td><td><button class='btn btn-danger' onclick='deleteuser("+data[i].id+")'>Delete</button></td></tr>"
			}
			$('#tdata').html(row)
		})
	}
	
	
	function edituser(id)
	{
		$.get('update',{id:id,action:"edit"},function(rt){+
			alert(rt)
			/* const data = JSON.parse(rt)
				$('#id').val(data.id)
				$('#uname').val(data.uname)
				$('#email').val(data.email)
				$('#phone').val(data.phone)
				$('#pass').val(data.pass) */
		})
	}
	
	function deleteuser(id)
	{
		$.get('update',{id:id,action:"delete"},function(rt){
			alert(rt)
			viewUser()
		})
	}
	
	</script>
	
</head>
<body>

	<div class="container">
		<h1 align='center'>Student Information</h1>
		<div class='row'>
			<div class='col-md-4'>
				<h2 align='center'>Registration Form</h2>
		
				<div class="from-group">
					<input type="hidden"  name="id" id="id"> 
					<label>Username</label>
					<input type="text" name="uname" placeholder="enter username"
						class="form-control" id='uname'>
				</div>

				<div class="from-group">
					<label>Email</label> <input type="text" name="email"
						placeholder="enter Email" class="form-control" id='email' >
					<span id="emailErr" class="text-danger"></span>
				</div>

				<div class="from-group">
					<label>Password</label> <input type="password" name="pass"
						placeholder="enter Password" class="form-control" id='pass'>
				</div>

				<div class="from-group">
					<label>Phone</label> <input type="text" name="phone"
						placeholder="enter Phone" class="form-control" id='phone'>
				</div>

				<div class="from-group">
					<br> <input type="submit" id="smbtn" class="btn btn-success" value="Submit" onclick="addUser()">
						<input type="submit" id="upbtn" class="btn btn-success" value="Update" onclick="updateData()">
				
				</div>
			</div>
			<div class='col-md-8'>
				<h2 align='center'>Student Details</h2>
					
				
				<input type="text" name="search" id="search" class="form-control" placeholder="Serach by username" onkeyup="searchdata(value)">
				
				<table class="table">
				<tr>
					<th>Id</th>
					<th>Uname</th>
					<th>Email</th>
					<th>Password</th>
					<th>Phone</th>
					<th colspan="2">Action</th>
				</tr>
				<tbody id="tdata">
				
				</tbody>
				</table>



			</div>
		</div>
	</div>






</body>
</html>