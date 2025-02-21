-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 21, 2025 at 12:23 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lbm_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `BOOK_ID` int(11) NOT NULL,
  `TITLE` varchar(255) DEFAULT NULL,
  `AUTHOR` varchar(255) DEFAULT NULL,
  `ISBN` int(255) DEFAULT NULL,
  `GENRE` varchar(255) DEFAULT NULL,
  `PUBLISHER` varchar(255) DEFAULT NULL,
  `PUBLICATION_YEAR` date DEFAULT NULL,
  `QUANTITY` int(11) DEFAULT NULL,
  `LOCATION` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`BOOK_ID`, `TITLE`, `AUTHOR`, `ISBN`, `GENRE`, `PUBLISHER`, `PUBLICATION_YEAR`, `QUANTITY`, `LOCATION`) VALUES
(1, 'The Eye of the World', 'Robert Jordan', 812511819, 'Fantasy', 'Tor Books', '1990-01-15', 5, 'Shelf A1'),
(2, 'The Great Hunt', 'Robert Jordan', 812517729, 'Fantasy', 'Tor Books', '1990-11-15', 5, 'Shelf A1'),
(3, 'The Dragon Reborn', 'Robert Jordan', 812513714, 'Fantasy', 'Tor Books', '1991-10-15', 5, 'Shelf A1'),
(4, 'The Shadow Rising', 'Robert Jordan', 812513738, 'Fantasy', 'Tor Books', '1992-09-15', 5, 'Shelf A1'),
(5, 'The Fires of Heaven', 'Robert Jordan', 812550306, 'Fantasy', 'Tor Books', '1993-10-15', 5, 'Shelf A1'),
(6, 'Lord of Chaos', 'Robert Jordan', 812513752, 'Fantasy', 'Tor Books', '1994-10-15', 5, 'Shelf A1'),
(7, 'A Crown of Swords', 'Robert Jordan', 812513769, 'Fantasy', 'Tor Books', '1996-05-15', 5, 'Shelf A1'),
(8, 'The Path of Daggers', 'Robert Jordan', 812513776, 'Fantasy', 'Tor Books', '1998-10-15', 5, 'Shelf A1'),
(9, 'Winter’s Heart', 'Robert Jordan', 812513783, 'Fantasy', 'Tor Books', '2000-11-15', 5, 'Shelf A1'),
(10, 'Crossroads of Twilight', 'Robert Jordan', 812513790, 'Fantasy', 'Tor Books', '2003-01-07', 5, 'Shelf A1'),
(11, 'Knife of Dreams', 'Robert Jordan', 812513738, 'Fantasy', 'Tor Books', '2005-10-11', 5, 'Shelf A1'),
(12, 'The Gathering Storm', 'Robert Jordan & Brandon Sanderson', 765302304, 'Fantasy', 'Tor Books', '2009-10-27', 5, 'Shelf A1'),
(13, 'Towers of Midnight', 'Robert Jordan & Brandon Sanderson', 765325945, 'Fantasy', 'Tor Books', '2010-11-02', 5, 'Shelf A1'),
(14, 'A Memory of Light', 'Robert Jordan & Brandon Sanderson', 765325952, 'Fantasy', 'Tor Books', '2013-01-08', 5, 'Shelf A1'),
(15, 'The Lightning Thief', 'Rick Riordan', 786838653, 'Fantasy', 'Disney-Hyperion', '2005-06-28', 5, 'Shelf A2'),
(16, 'The Sea of Monsters', 'Rick Riordan', 786856862, 'Fantasy', 'Disney-Hyperion', '2006-04-01', 5, 'Shelf A2'),
(17, 'The Titan’s Curse', 'Rick Riordan', 1423101451, 'Fantasy', 'Disney-Hyperion', '2007-05-01', 5, 'Shelf A2'),
(18, 'The Battle of the Labyrinth', 'Rick Riordan', 1423101468, 'Fantasy', 'Disney-Hyperion', '2008-05-06', 5, 'Shelf A2'),
(19, 'The Last Olympian', 'Rick Riordan', 1423101475, 'Fantasy', 'Disney-Hyperion', '2009-05-05', 5, 'Shelf A2'),
(20, 'I Am Number Four', 'Pittacus Lore', 61969553, 'Science Fiction', 'HarperCollins', '2010-08-03', 5, 'Shelf A3'),
(21, 'The Power of Six', 'Pittacus Lore', 61974571, 'Science Fiction', 'HarperCollins', '2011-08-23', 5, 'Shelf A3'),
(22, 'The Rise of Nine', 'Pittacus Lore', 61974588, 'Science Fiction', 'HarperCollins', '2012-08-21', 5, 'Shelf A3'),
(23, 'The Fall of Five', 'Pittacus Lore', 61974618, 'Science Fiction', 'HarperCollins', '2013-08-27', 5, 'Shelf A3'),
(24, 'The Revenge of Seven', 'Pittacus Lore', 62194725, 'Science Fiction', 'HarperCollins', '2014-08-26', 5, 'Shelf A3'),
(25, 'The Fate of Ten', 'Pittacus Lore', 62194726, 'Science Fiction', 'HarperCollins', '2015-09-01', 5, 'Shelf A3'),
(26, 'United as One', 'Pittacus Lore', 62194763, 'Science Fiction', 'HarperCollins', '2016-06-28', 5, 'Shelf A3'),
(27, 'Harry Potter and the Sorcerer’s Stone', 'J.K. Rowling', 439708180, 'Fantasy', 'Scholastic', '1997-06-26', 5, 'Shelf A4'),
(28, 'Harry Potter and the Chamber of Secrets', 'J.K. Rowling', 439064873, 'Fantasy', 'Scholastic', '1998-07-02', 5, 'Shelf A4'),
(29, 'Harry Potter and the Prisoner of Azkaban', 'J.K. Rowling', 439136365, 'Fantasy', 'Scholastic', '1999-07-08', 5, 'Shelf A4'),
(30, 'Harry Potter and the Goblet of Fire', 'J.K. Rowling', 439139601, 'Fantasy', 'Scholastic', '2000-07-08', 5, 'Shelf A4'),
(31, 'Harry Potter and the Order of the Phoenix', 'J.K. Rowling', 439358071, 'Fantasy', 'Scholastic', '2003-06-21', 5, 'Shelf A4'),
(32, 'Harry Potter and the Half-Blood Prince', 'J.K. Rowling', 439785969, 'Fantasy', 'Scholastic', '2005-07-16', 5, 'Shelf A4'),
(33, 'Harry Potter and the Deathly Hallows', 'J.K. Rowling', 545139700, 'Fantasy', 'Scholastic', '2007-07-21', 5, 'Shelf A4'),
(34, 'Heartstopper: Volume One', 'Alice Oseman', 1444951387, 'Graphic Novel', 'Hodder Children’s Books', '2019-02-07', 5, 'Shelf A5'),
(35, 'Heartstopper: Volume Two', 'Alice Oseman', 1444951400, 'Graphic Novel', 'Hodder Children’s Books', '2019-07-11', 5, 'Shelf A5'),
(36, 'Heartstopper: Volume Three', 'Alice Oseman', 1444952773, 'Graphic Novel', 'Hodder Children’s Books', '2020-02-06', 5, 'Shelf A5'),
(37, 'Heartstopper: Volume Four', 'Alice Oseman', 1444952797, 'Graphic Novel', 'Hodder Children’s Books', '2021-05-06', 5, 'Shelf A5'),
(38, 'Clean Code', 'Robert C. Martin', 132350884, 'Programming', 'Prentice Hall', '2008-08-01', 5, 'Shelf B1'),
(39, 'The Pragmatic Programmer', 'Andrew Hunt & David Thomas', 201616224, 'Programming', 'Addison-Wesley', '1999-10-30', 5, 'Shelf B1'),
(40, 'Design Patterns', 'Erich Gamma et al.', 201633610, 'Software Engineering', 'Addison-Wesley', '1994-10-21', 5, 'Shelf B1'),
(41, 'The Elements of Graphic Design', 'Alex W. White', 1581157628, 'Graphic Design', 'Allworth Press', '2011-10-04', 5, 'Shelf C1'),
(42, 'Thinking with Type', 'Ellen Lupton', 1568989693, 'Typography', 'Princeton Architectural Press', '2010-10-06', 5, 'Shelf C1'),
(43, 'Interaction of Color', 'Josef Albers', 300179354, 'Color Theory', 'Yale University Press', '2013-07-19', 5, 'Shelf C1'),
(44, 'Graphic Design: The New Basics', 'Ellen Lupton & Jennifer Cole Phillips', 1616893323, 'Graphic Design', 'Princeton Architectural Press', '2015-07-14', 5, 'Shelf C1'),
(45, 'Logo Design Love', 'David Airey', 321985200, 'Branding & Logo Design', 'New Riders', '2014-08-12', 5, 'Shelf C1'),
(46, 'Steal Like an Artist', 'Austin Kleon', 761169259, 'Creativity & Art', 'Workman Publishing', '2012-02-28', 5, 'Shelf C1'),
(47, 'Color and Light: A Guide for the Realist Painter', 'James Gurney', 740797712, 'Art & Painting', 'Andrews McMeel Publishing', '2010-11-30', 5, 'Shelf C2'),
(48, 'The Art of Pixar', 'Amid Amidi', 811879637, 'Animation & Concept Art', 'Chronicle Books', '2011-11-08', 5, 'Shelf C2'),
(49, 'The Animator’s Survival Kit', 'Richard Williams', 865478978, 'Animation', 'Farrar, Straus and Giroux', '2009-12-22', 5, 'Shelf C2'),
(50, 'How to Draw', 'Scott Robertson', 1933492735, 'Illustration', 'Design Studio Press', '2013-12-15', 5, 'Shelf C2'),
(51, 'The Art of Game Design: A Book of Lenses', 'Jesse Schell', 1138632059, 'Game Design', 'CRC Press', '2019-08-20', 5, 'Shelf C2'),
(52, 'Thinking, Fast and Slow', 'Daniel Kahneman', 374533557, 'Psychology', 'Farrar, Straus and Giroux', '2013-04-02', 5, 'Shelf D1'),
(53, 'Influence: The Psychology of Persuasion', 'Robert B. Cialdini', 61241895, 'Psychology', 'Harper Business', '2006-12-26', 5, 'Shelf D1'),
(54, 'The Power of Habit', 'Charles Duhigg', 812981605, 'Psychology', 'Random House', '2014-01-07', 5, 'Shelf D1'),
(55, 'Predictably Irrational', 'Dan Ariely', 61353246, 'Behavioral Economics', 'Harper', '2010-05-04', 5, 'Shelf D1'),
(56, 'The Lucifer Effect: Understanding How Good People Turn Evil', 'Philip Zimbardo', 812974447, 'Psychology', 'Random House', '2008-01-22', 5, 'Shelf D1'),
(57, 'Man’s Search for Meaning', 'Viktor E. Frankl', 807014271, 'Psychology', 'Beacon Press', '2006-06-01', 5, 'Shelf D2'),
(58, 'The Psychology of Money', 'Morgan Housel', 857197689, 'Psychology & Finance', 'Harriman House', '2020-09-08', 5, 'Shelf D2'),
(59, 'Meditations', 'Marcus Aurelius', 140449334, 'Philosophy', 'Penguin Classics', '2003-10-28', 5, 'Shelf D3'),
(60, 'The Republic', 'Plato', 140455113, 'Philosophy', 'Penguin Classics', '2007-02-22', 5, 'Shelf D3'),
(61, 'Beyond Good and Evil', 'Friedrich Nietzsche', 140449235, 'Philosophy', 'Penguin Classics', '2003-08-26', 5, 'Shelf D3'),
(62, 'Being and Time', 'Martin Heidegger', 61575594, 'Philosophy', 'Harper Perennial', '2008-07-22', 5, 'Shelf D3'),
(63, 'The Stranger', 'Albert Camus', 679720201, 'Philosophy & Literature', 'Vintage', '1989-03-13', 5, 'Shelf D3'),
(64, 'The Myth of Sisyphus', 'Albert Camus', 141182001, 'Existentialism', 'Penguin Classics', '2000-05-04', 5, 'Shelf D3'),
(65, 'Sophie’s World: A Novel About the History of Philosophy', 'Jostein Gaarder', 374530716, 'Philosophy & Fiction', 'Farrar, Straus and Giroux', '2007-03-20', 5, 'Shelf D4'),
(66, 'The Problems of Philosophy', 'Bertrand Russell', 195115529, 'Philosophy', 'Oxford University Press', '1997-05-08', 5, 'Shelf D4'),
(67, 'A History of Western Philosophy', 'Bertrand Russell', 671201586, 'Philosophy', 'Simon & Schuster', '1967-10-30', 5, 'Shelf D4'),
(68, 'Critique of Pure Reason', 'Immanuel Kant', 140447477, 'Philosophy', 'Penguin Classics', '1999-12-01', 5, 'Shelf D4'),
(69, 'The Ethics of Ambiguity', 'Simone de Beauvoir', 806501604, 'Philosophy', 'Kensington Publishing', '2015-03-01', 5, 'Shelf D4'),
(70, 'The 5 Love Languages: The Secret to Love That Lasts', 'Gary Chapman', 802412706, 'Relationships', 'Northfield Publishing', '2015-01-01', 5, 'Shelf E1'),
(71, 'Attached: The New Science of Adult Attachment and How It Can Help You Find – and Keep – Love', 'Amir Levine & Rachel Heller', 1585429134, 'Relationships', 'TarcherPerigee', '2010-12-30', 5, 'Shelf E1'),
(72, 'Men Are from Mars, Women Are from Venus', 'John Gray', 60574219, 'Relationships', 'Harper', '1992-04-23', 5, 'Shelf E1'),
(73, 'Hold Me Tight: Seven Conversations for a Lifetime of Love', 'Dr. Sue Johnson', 316113007, 'Relationships', 'Little, Brown and Company', '2008-04-08', 5, 'Shelf E1'),
(74, 'Nonviolent Communication: A Language of Life', 'Marshall B. Rosenberg', 1892005281, 'Communication', 'PuddleDancer Press', '2003-09-01', 5, 'Shelf E2'),
(75, 'The Seven Principles for Making Marriage Work', 'John M. Gottman & Nan Silver', 609805794, 'Relationships', 'Harmony', '2000-05-16', 5, 'Shelf E2'),
(76, 'The Mastery of Love: A Practical Guide to the Art of Relationship', 'Don Miguel Ruiz', 1878424426, 'Relationships & Personal Growth', 'Amber-Allen Publishing', '1999-10-01', 5, 'Shelf E2'),
(77, 'Why We Love: The Nature and Chemistry of Romantic Love', 'Helen Fisher', 805077964, 'Science & Relationships', 'Holt Paperbacks', '2005-01-01', 5, 'Shelf E2'),
(78, 'Act Like a Lady, Think Like a Man', 'Steve Harvey', 61728970, 'Relationships & Dating', 'Amistad', '2009-01-27', 5, 'Shelf E3'),
(79, 'Modern Romance', 'Aziz Ansari & Eric Klinenberg', 143109258, 'Relationships & Dating', 'Penguin Books', '2016-06-14', 5, 'Shelf E3'),
(80, 'Daring Greatly: How the Courage to Be Vulnerable Transforms the Way We Live, Love, Parent, and Lead', 'Brené Brown', 1592408412, 'Self-Help & Relationships', 'Avery', '2015-04-07', 5, 'Shelf E3'),
(81, 'Love Sense: The Revolutionary New Science of Romantic Relationships', 'Dr. Sue Johnson', 316195669, 'Psychology & Relationships', 'Little, Brown and Company', '2013-12-31', 5, 'Shelf E3');

-- --------------------------------------------------------

--
-- Table structure for table `borrowing`
--

CREATE TABLE `borrowing` (
  `BORROWING_ID` int(11) NOT NULL,
  `BOOK_ID` int(11) NOT NULL,
  `USER_ID` int(11) NOT NULL,
  `BORROWING_DATE` date NOT NULL,
  `RETURN_DATE` date NOT NULL,
  `STATUS` varchar(50) NOT NULL,
  `COPIES` int(11) NOT NULL,
  `OVERDUE_DAYS` int(11) DEFAULT NULL,
  `FINE_AMOUNT` double DEFAULT NULL,
  `PAYMENT_STATUS` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `borrowing`
--

INSERT INTO `borrowing` (`BORROWING_ID`, `BOOK_ID`, `USER_ID`, `BORROWING_DATE`, `RETURN_DATE`, `STATUS`, `COPIES`, `OVERDUE_DAYS`, `FINE_AMOUNT`, `PAYMENT_STATUS`) VALUES
(1, 2, 6, '2025-02-16', '2025-02-26', 'RETURNED', 1, NULL, NULL, 'NULL'),
(2, 10, 5, '2025-02-02', '2025-02-08', 'RETURNED', 1, NULL, NULL, 'NULL'),
(3, 6, 8, '2025-02-09', '2025-02-21', 'RETURNED', 3, NULL, NULL, 'NULL'),
(4, 20, 5, '2025-02-10', '2025-02-15', 'RETURNED', 1, NULL, NULL, 'NULL'),
(5, 3, 5, '2025-02-01', '2025-02-16', 'OVERDUE', 3, 2, 100, 'UNPAID'),
(6, 5, 5, '2025-01-23', '2025-01-29', 'OVERDUE', 4, 1, 50, 'UNPAID'),
(7, 2, 2, '2025-02-08', '2025-02-25', 'OVERDUE', 1, 6, 300, 'UNPAID'),
(8, 11, 8, '2025-02-06', '2025-02-26', 'OVERDUE', 2, 7, 350, 'UNPAID'),
(9, 14, 2, '2025-01-25', '2025-02-04', 'RETURNED', 2, NULL, NULL, 'NULL'),
(10, 7, 8, '2025-02-08', '2025-02-22', 'RETURNED', 2, NULL, NULL, 'NULL'),
(11, 15, 7, '2025-02-20', '2025-03-05', 'RETURNED', 4, NULL, NULL, 'NULL'),
(12, 4, 7, '2025-02-19', '2025-03-01', 'RETURNED', 3, NULL, NULL, 'NULL'),
(13, 16, 5, '2025-02-09', '2025-02-27', 'OVERDUE', 4, 7, 350, 'UNPAID'),
(14, 8, 2, '2025-01-27', '2025-02-03', 'RETURNED', 4, NULL, NULL, 'NULL'),
(15, 12, 5, '2025-01-25', '2025-02-03', 'RETURNED', 2, NULL, NULL, 'NULL'),
(16, 13, 8, '2025-01-24', '2025-02-11', 'OVERDUE', 3, 7, 350, 'PAID'),
(17, 12, 8, '2025-02-12', '2025-02-21', 'RETURNED', 1, NULL, NULL, 'NULL'),
(18, 13, 8, '2025-02-09', '2025-02-16', 'RETURNED', 2, NULL, NULL, 'NULL'),
(19, 15, 6, '2025-02-17', '2025-02-28', 'RETURNED', 1, NULL, NULL, 'NULL'),
(20, 2, 2, '2025-02-05', '2025-02-16', 'RETURNED', 2, NULL, NULL, 'NULL'),
(21, 8, 8, '2025-02-17', '2025-03-02', 'OVERDUE', 4, 4, 200, 'PAID'),
(22, 13, 5, '2025-01-29', '2025-02-18', 'OVERDUE', 2, 8, 400, 'UNPAID'),
(23, 15, 2, '2025-01-25', '2025-02-06', 'OVERDUE', 5, 6, 300, 'PAID'),
(24, 4, 5, '2025-02-07', '2025-02-17', 'OVERDUE', 5, 4, 200, 'UNPAID'),
(25, 10, 2, '2025-01-31', '2025-02-16', 'OVERDUE', 1, 6, 300, 'PAID'),
(26, 12, 8, '2025-02-05', '2025-02-16', 'OVERDUE', 2, 1, 50, 'UNPAID'),
(27, 1, 7, '2025-02-13', '2025-02-19', 'RETURNED', 2, NULL, NULL, 'NULL'),
(28, 20, 6, '2025-02-19', '2025-03-01', 'RETURNED', 5, NULL, NULL, 'NULL'),
(29, 8, 8, '2025-02-19', '2025-03-11', 'OVERDUE', 1, 6, 300, 'PAID'),
(30, 11, 2, '2025-02-04', '2025-02-13', 'OVERDUE', 2, 2, 100, 'PAID'),
(31, 16, 7, '2025-02-15', '2025-02-27', 'RETURNED', 1, NULL, NULL, 'NULL'),
(32, 6, 7, '2025-01-22', '2025-02-14', 'OVERDUE', 3, 8, 400, 'UNPAID'),
(33, 11, 2, '2025-01-26', '2025-02-11', 'OVERDUE', 1, 1, 50, 'PAID'),
(34, 14, 7, '2025-02-18', '2025-03-07', 'OVERDUE', 3, 6, 300, 'PAID'),
(35, 14, 8, '2025-02-04', '2025-02-09', 'RETURNED', 2, NULL, NULL, 'NULL'),
(36, 3, 8, '2025-02-20', '2025-03-05', 'RETURNED', 2, NULL, NULL, 'NULL'),
(37, 19, 6, '2025-01-25', '2025-02-09', 'OVERDUE', 4, 3, 150, 'PAID'),
(38, 10, 5, '2025-02-02', '2025-02-14', 'RETURNED', 2, NULL, NULL, 'NULL'),
(39, 19, 5, '2025-02-10', '2025-02-17', 'RETURNED', 1, NULL, NULL, 'NULL'),
(40, 12, 5, '2025-02-20', '2025-03-04', 'OVERDUE', 1, 2, 100, 'UNPAID'),
(41, 20, 8, '2025-02-04', '2025-02-22', 'OVERDUE', 5, 4, 200, 'PAID'),
(42, 12, 5, '2025-01-28', '2025-02-10', 'RETURNED', 1, NULL, NULL, 'NULL'),
(43, 19, 2, '2025-02-07', '2025-02-19', 'OVERDUE', 1, 4, 200, 'UNPAID'),
(44, 7, 2, '2025-01-23', '2025-02-07', 'OVERDUE', 4, 8, 400, 'PAID'),
(45, 2, 2, '2025-01-25', '2025-02-04', 'OVERDUE', 1, 3, 150, 'PAID'),
(46, 12, 5, '2025-02-04', '2025-02-19', 'OVERDUE', 1, 6, 300, 'UNPAID'),
(47, 17, 6, '2025-02-08', '2025-02-22', 'OVERDUE', 1, 1, 50, 'UNPAID'),
(48, 5, 5, '2025-02-17', '2025-03-04', 'RETURNED', 1, NULL, NULL, 'NULL'),
(49, 1, 7, '2025-02-03', '2025-02-15', 'RETURNED', 3, NULL, NULL, 'NULL'),
(50, 3, 2, '2025-01-26', '2025-02-14', 'OVERDUE', 1, 10, 500, 'PAID'),
(51, 17, 7, '2025-02-19', '2025-03-03', 'OVERDUE', 4, 6, 300, 'UNPAID'),
(52, 16, 7, '2025-02-19', '2025-03-04', 'RETURNED', 1, NULL, NULL, 'NULL'),
(53, 10, 8, '2025-02-12', '2025-02-27', 'RETURNED', 4, NULL, NULL, 'NULL'),
(54, 12, 8, '2025-01-26', '2025-02-05', 'OVERDUE', 1, 2, 100, 'UNPAID'),
(55, 9, 5, '2025-01-30', '2025-02-16', 'OVERDUE', 1, 2, 100, 'PAID'),
(56, 5, 5, '2025-02-18', '2025-03-01', 'RETURNED', 1, NULL, NULL, 'NULL'),
(57, 9, 8, '2025-01-22', '2025-01-27', 'RETURNED', 3, NULL, NULL, 'NULL'),
(58, 1, 6, '2025-01-23', '2025-02-01', 'RETURNED', 4, NULL, NULL, 'NULL'),
(59, 1, 6, '2025-01-28', '2025-02-10', 'OVERDUE', 1, 6, 300, 'PAID'),
(60, 7, 8, '2025-01-26', '2025-02-04', 'RETURNED', 1, NULL, NULL, 'NULL'),
(61, 9, 7, '2025-02-01', '2025-02-07', 'RETURNED', 2, NULL, NULL, 'NULL'),
(62, 18, 2, '2025-02-18', '2025-02-28', 'RETURNED', 2, NULL, NULL, 'NULL'),
(63, 10, 5, '2025-02-07', '2025-02-22', 'RETURNED', 3, NULL, NULL, 'NULL'),
(64, 10, 5, '2025-01-23', '2025-02-06', 'OVERDUE', 3, 7, 350, 'UNPAID'),
(65, 1, 2, '2025-01-25', '2025-02-13', 'OVERDUE', 4, 5, 250, 'UNPAID'),
(66, 3, 5, '2025-02-10', '2025-02-28', 'OVERDUE', 1, 3, 150, 'UNPAID'),
(67, 2, 8, '2025-02-16', '2025-03-08', 'OVERDUE', 2, 9, 450, 'PAID'),
(68, 10, 2, '2025-01-26', '2025-02-01', 'RETURNED', 1, NULL, NULL, 'NULL'),
(69, 5, 6, '2025-02-14', '2025-03-03', 'OVERDUE', 1, 8, 400, 'UNPAID'),
(70, 7, 5, '2025-02-14', '2025-02-24', 'RETURNED', 1, NULL, NULL, 'NULL'),
(71, 9, 8, '2025-01-28', '2025-02-12', 'OVERDUE', 3, 3, 150, 'PAID');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `USER_ID` int(11) NOT NULL,
  `FIRST_NAME` varchar(255) DEFAULT NULL,
  `MIDDLE_NAME` varchar(255) DEFAULT NULL,
  `LASTNAME` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `PHONE_NUMBER` varchar(255) DEFAULT NULL,
  `USERNAME` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  `ROLE` enum('USER','LIBRARIAN') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`USER_ID`, `FIRST_NAME`, `MIDDLE_NAME`, `LASTNAME`, `EMAIL`, `PHONE_NUMBER`, `USERNAME`, `PASSWORD`, `ROLE`) VALUES
(1, 'AJ', 'ERICO', 'CATLI', 'catliaj5@gmail.com', '0940584674', 'catliaj', 'admin', 'LIBRARIAN'),
(2, 'nemo', 'fish', 'missing', 'nemo123@fish.com', '8237824', 'nemo', 'user', 'USER'),
(3, 'JARED', 'ANCIADO', 'ABELLERA', 'jaredabellera97@gmail.com', '09694465890', 'red', 'betrayer', 'LIBRARIAN'),
(4, 'ARAVHEIYL', 'BARCELON', 'FELICISIMO', 'arafelicisimo@gmail.com', '09765334562', 'ara', 'artsy', 'LIBRARIAN'),
(5, 'MARK', 'NOLAN', 'GRAYSON', 'markgrayson@gmail.com', '0978295678', 'invincible', 'eve', 'USER'),
(6, 'SAMANTHA EVE', 'ROBERT', 'WILKINS', 'evewilkins@gmail.com', '0961567623', 'atomeve', 'mark', 'USER'),
(7, 'ANABETH ', 'ATHENA', 'CHASE', 'anabethchase@gmail.com', '09876567813', 'anabeth', 'invisicap', 'USER'),
(8, 'PERSEUS', 'POSEIDON', 'JACKSON', 'percyjackson@gmail.com', '09876756543', 'percy', 'seaweedbrain', 'USER');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`BOOK_ID`);

--
-- Indexes for table `borrowing`
--
ALTER TABLE `borrowing`
  ADD PRIMARY KEY (`BORROWING_ID`),
  ADD KEY `borrowing_book` (`BOOK_ID`),
  ADD KEY `borrowing_user` (`USER_ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`USER_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `BOOK_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=82;

--
-- AUTO_INCREMENT for table `borrowing`
--
ALTER TABLE `borrowing`
  MODIFY `BORROWING_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=72;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `USER_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `borrowing`
--
ALTER TABLE `borrowing`
  ADD CONSTRAINT `borrowing_book` FOREIGN KEY (`BOOK_ID`) REFERENCES `books` (`BOOK_ID`) ON UPDATE CASCADE,
  ADD CONSTRAINT `borrowing_user` FOREIGN KEY (`USER_ID`) REFERENCES `users` (`USER_ID`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
