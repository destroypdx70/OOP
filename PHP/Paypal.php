<?php
require_once("payment.php")
class Paypal extends payment {
    public $Reference = String;
    public $Branch = String;

    public function __construct($id, $Reference, $Branch) {
        parent::__construct($id);
        $this->Reference = $Reference;
        $this->Branch = $Branch;
    }
}



?>