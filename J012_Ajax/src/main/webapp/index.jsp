<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
			<script type="text/javascript">
			
			function loaddata()
			{
				var val = $('#data').val()
				
				$.get('data',{val},function(rt){
					$('#result').html(rt)
				})
			}
			
			</script>
			

</head>
<body>
		<input type="text" name="data" id="data" onkeyup="loaddata()">
		<button onclick="loaddata()">Click</button>
		
		<span id="result"></span>
</body>
</html>