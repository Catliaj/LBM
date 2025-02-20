# Library Management System

## Overview
The Library Management System is designed to streamline the management of library resources, including books, users, borrowing, and returns. The system supports both library staff and members, offering a structured way to handle book cataloging, member registration, borrowing processes, and overdue book management.

## Features

### User Management
- Register new members with personal details (name, email, address, contact info, etc.).
- Secure login for users to access profiles and borrowing history.
- Differentiate between staff (who manage books and users) and regular members (who borrow books).

### Book Catalog Management
- Librarians can add new books with details:
  - Title
  - Author(s)
  - ISBN
  - Genre/Category (e.g., Fiction, Non-fiction, Science, History, etc.)
  - Publisher
  - Publication year
  - Quantity available
  - Library location (shelf number or section)
- Search books using filters (title, author, category, ISBN, etc.).
- Staff can update book details if necessary.

### Borrowing and Returning Books
- Members can check out books for a predefined period.
- Staff manage the checkout process.
- Due dates for borrowed books.
- Option for members to renew books if not reserved by others.
- Log book returns and update inventory.
- Calculate late fees for overdue books.

### Reservations and Book Requests
- Members can reserve checked-out books.
- Notify users when reserved books become available.
- Maintain a queue for high-demand books.

### Inventory and Stock Management
- Update book availability automatically.
- Notify staff about low stock or high-demand books.
- Maintain book condition records for replacements or repairs.

### Reports and Analytics
- Track borrowing history per member.
- Generate reports on popular books, overdue books, inventory levels, and missing/damaged books.
- Report on member activities (e.g., books borrowed, late returns, reservations made).

### Notifications
- Automated reminders for due dates.
- Alerts for overdue books.
- Notifications for reserved books becoming available.
- Announcements for new book arrivals.

### Fine Management
- Calculate fines based on library policies (e.g., $1 per day overdue).
- Allow online or in-person fine payments.
- Staff can waive fines under special circumstances.

### Security and Access Control
- Role-based access control to limit certain actions to staff (e.g., adding books, modifying data).
- Encrypt sensitive user data.
- Track system activity for accountability.

### User Interface
- Simple, well-organized navigation for staff and users.
- Efficient search options for books.
- Clear calls to action (e.g., "Borrow", "Return", "Search").

## Contributors
1. AJ CATLI
2. Jared Abellera
3. Aravheiyl Felicisimo

## Installation and Setup
1. Clone the repository:
   ```sh
   git clone <repository-url>
   ```
2. Install dependencies:
   ```sh
   npm install / composer install / pip install -r requirements.txt
   ```
3. Set up the database and configure environment variables.
4. Run the application:
   ```sh
   npm start / php artisan serve / python app.py
   ```

## License
This project is licensed under the MIT License.