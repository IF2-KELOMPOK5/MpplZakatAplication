<?php
//url yang di scrap

$url = $_POST["url"];
$html = file_get_contents($url);
$x = 0;
$y = 0;
$z = 0;
$seri = 'Memory Notebook 4GB DDR3L PC-12800';
while($x <= 23){
	//pencarian posisi kata
	$fpos = (strpos($html,'"Seri"',$z) +9);
	//pencarian posisi gambar
	$ipos = (strpos($html,'<img style="height: 160px; width: 160px;" src="',$y));
	//pencarian ujung gambar 
	$ispos = (strpos($html,'alt=',$ipos));
	//pencarian ujung kata dan harga
	$spos = (strpos($html,'"Price"',$z)+9);
	//perhitungan jarak
$lipos= $ispos - $ipos;
$lpos = $spos - ($fpos + 29);
//pemotongan kata dari seluruh web
$fhasil = substr($html,$ipos,$lipos);
$fihasil = substr($html,$fpos,$lpos);
$shasil = substr($html,$spos,6);
//penampilan check posisi kata
$z = $spos + 10;
$y = $ispos + 10;
//posisi awal
//echo "<li>".$fpos."</li>";
//posisi akhir
//echo "<li>".$spos."</li>";
//penampilan banyak nya yang di tampilkan
//echo "<li>".$lpos."</li>";
//penampilan tempat gambar
//echo "<li>".$lipos."</li>";
//penampilan nama
echo "<li>".$fhasil."</li>";
//penampilan harga
echo "<li>Rp.".$shasil."</li>";
//penampilan gambar?
echo "<li>".$fihasil."</img></li>";
echo "<li>".$x."</li>";
$x++;

}
?>