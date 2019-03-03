<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>Which movie?</title>
  </head>
  <body>
  
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    
	<h1 align="center">Hello, ${name }</h1>
	<br><br>
	<h3 align="center">What movie would you like to watch?</h3>
	<br><br><br>
		<form action="PostWhichMovie" method="post">
    		<!-- <p style="color: red">Hello, ${name }</p> -->
    		
<!--     			<div style="position:absolute; bottom:350px; right:350px; z-index:999" > -->
<!--     				<button type="submit" name="action" value="action" >Action</button><br> -->
<!--     				<button type="submit" name="action" value="adventure">Adventure</button><br> -->
<!--     				<button type="submit" name="action" value="animation">Animation</button><br> -->
<!--     				<button type="submit" name="action" value="comedy">Comedy</button> -->
<!-- 				</div> -->
    			
<!--     			<div style="position:absolute; bottom:200px; right:200px; z-index:999" > -->
<!--     				<button type="submit" name="action" value="documentary">Documentary</button><br> -->
<!--     				<button type="submit" name="action" value="drama">Drama</button><br> -->
<!--     				<button type="submit" name="action" value="family">Family</button><br> -->
<!--     				<button type="submit" name="action" value="fantasy">Fantasy</button><br> -->
<!--     				<button type="submit" name="action" value="horror">Horror</button> -->
<!-- 				</div> -->
    			
<!--     			<div style="position:absolute; bottom:10px; right:10px; z-index:999" > -->
<!--     				<button type="submit" name="action" value="marvel">Marvel</button><br> -->
<!--     				<button type="submit" name="action" value="romantic">Romantic</button><br> -->
<!--     				<button type="submit" name="action" value="scienceFiction">Sci-fi</button><br> -->
<!--     				<button type="submit" name="action" value="thriller">Thriller</button> -->
<!-- 				</div> -->
				
<!-- 				<div class="d-flex justify-content-between"> -->
<!--  					<button type="button" class="btn btn-secondary">Back</button> -->
<!--  					<div> -->
<!--  						<button type="button" class="btn btn-danger">Cancel</button> -->
<!--  							<button type="button" class="btn btn-secondary">Save and Exit</button> -->
<!--  					</div> -->
<!--  						<button type="submit" class="btn btn-primary">Next</button> -->
<!--  				</div> -->
 				
 				<div class="d-flex justify-content-between">
 					<div>
 						<button type="submit" name="action" value="action" class="btn btn-primary">Action</button><br><br><br>
    						<button type="submit" name="action" value="adventure" class="btn btn-primary">Adventure</button><br><br><br>
    							<button type="submit" name="action" value="animation" class="btn btn-primary">Animation</button><br><br><br>
    								<button type="submit" name="action" value="documentary" class="btn btn-primary">Documentary</button>
 					</div>
 						<div>
 							<button type="submit" name="action" value="marvel" class="btn btn-primary">Marvel</button><br><br><br>
    							<button type="submit" name="action" value="drama" class="btn btn-primary">Drama</button><br><br><br>
    								<button type="submit" name="action" value="family" class="btn btn-primary">Family</button><br><br><br>
    									<button type="submit" name="action" value="fantasy" class="btn btn-primary">Fantasy</button><br><br><br>
    										<button type="submit" name="action" value="horror" class="btn btn-primary">Horror</button>
 						</div>
 							<div>
 								<button type="submit" name="action" value="comedy" class="btn btn-primary">Comedy</button><br><br><br>
    								<button type="submit" name="action" value="romantic" class="btn btn-primary">Romantic</button><br><br><br>
    									<button type="submit" name="action" value="scienceFiction" class="btn btn-primary">Sci-fi</button><br><br><br>
    										<button type="submit" name="action" value="thriller" class="btn btn-primary">Thriller</button>
 							</div>
 				</div>
				
    	</form>
</body>
</html>