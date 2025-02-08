<?php include 'includes/header.php'; ?>
<h2>Admin Login</h2>
<?php if(isset($_GET['error'])): ?>
    <p class="error">Invalid credentials!</p>
<?php endif; ?>

<form action="contact_list.php" method="POST">
    <label>Username:</label>
    <input type="text" name="username" required>
    
    <label>Password:</label>
    <input type="password" name="password" required>
    
    <button type="submit">Login</button>
</form>
<?php include 'includes/footer.php'; ?>