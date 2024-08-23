window.onload = function() {
    const loader = document.querySelector('.loader');
    const successMessage = document.getElementById('successMessage');

    // Show loader
    loader.style.display = 'block';

    // Simulate content loading
    setTimeout(() => {
        // Hide loader
        loader.style.display = 'none';

        // Show success message
        successMessage.style.display = 'block';
    }, 3000); // Adjust the timing as needed
}
