<!DOCTYPE html>
<html>
  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <script src="jquery-3.2.1.min.js"></script>
    <title>Pharser</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/shop-homepage.css" rel="stylesheet">

  </head>
 <body>
  <div id="content" style="margin-top:10px;height:100%;">
   <center><h1>Bhinekka search Pharser</h1></center>
    div
    URL : <input name="url" class="inp" size="35" placeholder=""/>
    <input type="submit" class="btn" name="submit" value="Start Scrapping"/>
   <br/>

<script >
	$(document).ready(function(){
    $(".btn").click(function(){
    x = $(".inp").val();
    $.post("en.php",{url:x},function(data, status){
      $(".show").append(data); 
    });

});

    });
</script>
<div class="show"></div>