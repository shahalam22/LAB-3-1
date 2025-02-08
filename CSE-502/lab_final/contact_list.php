<?php
session_start();
include 'includes/config.php';

// Check login
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    if ($_POST['username'] === 'admin' && $_POST['password'] === '123456') {
        $_SESSION['loggedin'] = true;
    } else {
        header("Location: admin_login.php?error=1");
        exit();
    }
}

if (!isset($_SESSION['loggedin'])) {
    header("Location: admin_login.php");
    exit();
}

// Fetch contacts
$stmt = $pdo->query("SELECT * FROM contacts ORDER BY created_at DESC");
$contacts = $stmt->fetchAll();
?>

<?php include 'includes/header.php'; ?>
<h2>Contact Submissions</h2>
<table>
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Subject</th>
        <th>Message</th>
        <th>Date</th>
    </tr>
    <?php foreach ($contacts as $contact): ?>
    <tr>
        <td><?= $contact['name'] ?></td>
        <td><?= $contact['email'] ?></td>
        <td><?= $contact['subject'] ?></td>
        <td><?= $contact['message'] ?></td>
        <td><?= $contact['created_at'] ?></td>
    </tr>
    <?php endforeach; ?>
</table>
<?php include 'includes/footer.php'; ?>