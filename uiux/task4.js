document.getElementById('actionButton').addEventListener('click', function() {
    const spinner = document.getElementById('spinner');
    const successMessage = document.getElementById('successMessage');
    
    // Show spinner and hide success message
    spinner.style.display = 'block';
    successMessage.style.display = 'none';

    // Simulate processing time
    setTimeout(() => {
        // Hide spinner and show success message
        spinner.style.display = 'none';
        successMessage.style.display = 'block';
    }, 2000); // 2 seconds for demonstration
});
