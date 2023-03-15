<?php
require_once("payment.php")
class Cash extends payment {
    public $id = Integer;

    public function __contruct($id){
        parent::__contruct($id);
    }
}

?>