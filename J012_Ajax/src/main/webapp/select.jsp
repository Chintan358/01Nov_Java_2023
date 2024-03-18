<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	<script type="text/javascript">
		
		$(document).ready(function(){
			getcountries()
		})
	
		function getcountries()
		{
			$.get('country',{},function(rt){
				$('#country').html(rt)
			})
		}
		
		function getstate(sid)
		{
			
			$.get('state',{sid},function(rt){
				$('#state').html(rt)
			})
		}
		
		function getcity(sid)
		{
			
			$.get('city',{sid},function(rt){
				$('#city').html(rt)
			})
		}
		
	</script>
</head>
<body>
		
		<select id="country" name="country" onchange="getstate(value)">
		 <option>---select country---</option>
		</select>
		
		<select id="state" name="state" onchange="getcity(value)">
		 <option>---select state---</option>
		</select>
		
		
		<select id="city" name="city">
		 <option>---select city---</option>
		</select>
		
</body>
</html>