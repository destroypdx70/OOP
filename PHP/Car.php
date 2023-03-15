<?php
require_once("Account.php");
class Car {
    public $id = integer;
    public $license = string;
    public $driver = string;
    public $passegenger = integer; 

        public function __construct($license,$driver)
        {
            $this->_license=$license;
            $this->_driver=$driver;
        }
    
        public function printDataCar() {
            echo "License: $this->license Driver: ".$this->driver->name;
        }
    }

?>