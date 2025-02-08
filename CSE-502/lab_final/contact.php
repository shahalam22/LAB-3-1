<?php include 'includes/header.php'; ?>
<h2>Contact Me</h2>
<form id="contactForm" action="process_contact.php" method="POST">
    <label>Name:</label>
    <input type="text" name="name" required>
    
    <label>Email:</label>
    <input type="email" name="email" required>
    
    <label>Subject:</label>
    <input type="text" name="subject" required>
    
    <label>Message:</label>
    <textarea name="message" required></textarea>
    
    <button type="submit">Send Message</button>
</form>
<?php include 'includes/footer.php'; ?>