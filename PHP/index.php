<?php
require_once("Car.php");
require_once("UberX.php");
require_once("Account.php");
require_once("UberPool.php")

$UberX = new UberX("Anyi Manuela Gallego", "7353715383"), "Mercedez", "A200");
$UberX->printDataCar();

$UberPool = new UberPool("ELI789", new Account("Elizabeth Palacio", "7353715383"), "Mercedez", "A200");
$UberPool->printDataCar();
?>