<?php
    require "database.php";
    
    $db = new Database("192.168.64.2", "livemap", "livemap", "123");

    function isEvent($event) {
        $possibleEvents = ['career', 'party', 'clubs'];
        foreach($possibleEvents as $e) {
            if ($event == $e) {
                return true;
            }
        }
        return false;
    }

    if ($_SERVER['REQUEST_METHOD'] == 'GET') {
        $event = $_GET['event'];

        if (empty($event)) {
            echo "No Event? :("; 
            exit;
        }

        if (!isEvent($event)) {
            echo "Not a valid event :(";
            exit;
        }
        
        $data = $db->select($event, '1', '1', PDO::FETCH_ASSOC);
        echo json_encode($data);
        exit;
        
    }

    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
        $raw = file_get_contents('php://input');
        $body = json_decode($raw, true);

        $event = $body['event'];
        $message = $body['message'];
        $location = $body['location'];
        $time = intval($body['time']);

        if (!isEvent($event)) {
            echo "Not a valid event :(";
            exit;
        }
        
        $data = array(NULL, $message, $location, $time);
        $db->insert($event, $data);

        $data = $db->select($event, '1', '1', PDO::FETCH_ASSOC);
        echo json_encode($data);
        exit;
        
        
    }

?>