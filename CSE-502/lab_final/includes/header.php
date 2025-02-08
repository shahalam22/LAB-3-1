<?php session_start(); ?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Portfolio</title>
    <link rel="stylesheet" href="css/1439.css">
</head>
<body>
    <header>
        <nav>
            <ul class="main-menu">
                <li><a href="index.php">Home</a></li>
                <li class="dropdown">
                    <a href="about.php">About Me ▼</a>
                    <ul class="dropdown-content">
                        <li><a href="personal_info.php">Personal Info</a></li>
                        <li><a href="education.php">Education</a></li>
                        <li><a href="work.php">Work</a></li>
                    </ul>
                </li>
                <li><a href="contact.php">Contact Me</a></li>
                <?php if(isset($_SESSION['loggedin'])): ?>
                    <li><a href="contact_list.php">Contact List</a></li>
                    <li><a href="logout.php">Logout</a></li>
                <?php else: ?>
                    <li><a href="admin_login.php">Admin</a></li>
                <?php endif; ?>
            </ul>
        </nav>
    </header>
    <div class="container">