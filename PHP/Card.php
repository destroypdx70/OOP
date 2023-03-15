<?php
require_once("Account.php");
class Card extends payment{
    public $id = integer;
    public $Franchise = string;
    public $Duedate = Integer;
    public $CVV = integer; 

        public function __construct($Franchise, $Duedate)
        {
            parent::__construct($id);
            $this->$Franchise = $Franchise;
            $this->$Duedate = $Duedate;
            $this->$CVV = $CVV;
        }
    
        
    }

?>