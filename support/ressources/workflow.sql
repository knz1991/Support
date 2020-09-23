-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  jeu. 24 sep. 2020 à 00:57
-- Version du serveur :  10.3.16-MariaDB
-- Version de PHP :  7.1.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `workflow`
--

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1);

-- --------------------------------------------------------

--
-- Structure de la table `workflow`
--

CREATE TABLE `workflow` (
  `idworkflow` bigint(20) NOT NULL,
  `description` varchar(255) NOT NULL,
  `enable` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `idcategorie` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `workflow`
--

INSERT INTO `workflow` (`idworkflow`, `description`, `enable`, `name`, `idcategorie`) VALUES
(1, 'Description Tache 1', 1, 'Tache 1', 1),
(2, 'Description Tache 2', 1, 'Tache 2', 1),
(3, 'Description Tache 3', 1, 'Tache 3', 1),
(4, 'Description Tache 4', 1, 'Tache 4', 1),
(5, 'Description Tache 1', 1, 'Tache 1', 1),
(6, 'Description Tache 2', 1, 'Tache 2', 1),
(7, 'Description Tache 3', 1, 'Tache 3', 1),
(8, 'Description Tache 4', 1, 'Tache 4', 1),
(9, 'Description Tache 11', 2, 'Tache 11', 2),
(10, 'Description Tache 21', 2, 'Tache 21', 2),
(11, 'Description Tache 31', 2, 'Tache 31', 2),
(12, 'Description Tache 41', 1, 'Tache 41', 2),
(13, 'Description Tache 12', 3, 'Tache 12', 3),
(14, 'Description Tache 22', 3, 'Tache 22', 3),
(15, 'Description Tache 32', 3, 'Tache 32', 3),
(16, 'Description Tache 42', 3, 'Tache 42', 3),
(17, 'Description Tache 11', 2, 'Tache 11', 2),
(18, 'Description Tache 21', 2, 'Tache 21', 2),
(19, 'Description Tache 31', 2, 'Tache 31', 2),
(20, 'Description Tache 41', 1, 'Tache 41', 2),
(21, 'Description Tache 11', 2, 'Tache 11', 2),
(22, 'Description Tache 21', 2, 'Tache 21', 2),
(23, 'Description Tache 31', 2, 'Tache 31', 2),
(24, 'Description Tache 41', 1, 'Tache 41', 2);

-- --------------------------------------------------------

--
-- Structure de la table `workflow_categories`
--

CREATE TABLE `workflow_categories` (
  `idcategorie` bigint(20) NOT NULL,
  `createat` date NOT NULL,
  `description` varchar(255) NOT NULL,
  `enable` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `parentcategorie` bigint(20) NOT NULL,
  `updateat` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `workflow_categories`
--

INSERT INTO `workflow_categories` (`idcategorie`, `createat`, `description`, `enable`, `name`, `parentcategorie`, `updateat`) VALUES
(1, '2020-09-23', 'Evènement a faire', 1, 'TO DO', 1, '2020-09-23'),
(3, '2020-09-23', 'Evènement en cours ', 2, 'IN PROGRESS', 1, '2020-09-23'),
(4, '2020-09-23', ' Retour Evènement', 3, 'REGRESSION', 1, '2020-09-23'),
(5, '2020-09-23', 'Evènement en Stand By ', 4, 'STAND BY', 1, '2020-09-23'),
(6, '2020-09-23', 'Evènement Traité', 5, 'DONE', 1, '2020-09-23');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `workflow`
--
ALTER TABLE `workflow`
  ADD PRIMARY KEY (`idworkflow`);

--
-- Index pour la table `workflow_categories`
--
ALTER TABLE `workflow_categories`
  ADD PRIMARY KEY (`idcategorie`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `workflow`
--
ALTER TABLE `workflow`
  MODIFY `idworkflow` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT pour la table `workflow_categories`
--
ALTER TABLE `workflow_categories`
  MODIFY `idcategorie` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
