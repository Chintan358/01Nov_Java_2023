<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	<script type="text/javascript">
	
	function search()
	{
		var data = $('#search').val()
		
		$.get('search',{data},function(rt){
			$('#sdata').html(rt)
		})
	}
	</script>
</head>
<body>
		<input type="text" name="search" id="search" onkeyup="search()">
		<div id="sdata"></div>
</body>
</html>