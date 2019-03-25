CREATE TABLE IF NOT EXISTS `${PuzzleType}` (
	`puzzle_type_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 
	`name` TEXT, 
	`fragment_class` TEXT, 
	`value_multiplier` INTEGER NOT NULL, 
	`time_spent` INTEGER NOT NULL
);

CREATE TABLE IF NOT EXISTS `${Score}` (
	`score_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 
	`time_starts` INTEGER NOT NULL, 
	`score_time` INTEGER NOT NULL, 
	`value` INTEGER NOT NULL, 
	`user_id` INTEGER NOT NULL, 
	`puzzle_type_id` INTEGER NOT NULL, 
	FOREIGN KEY(`user_id`) REFERENCES `User`(`user_id`) ON UPDATE NO ACTION ON DELETE CASCADE , 
	FOREIGN KEY(`puzzle_type_id`) REFERENCES `PuzzleType`(`puzzle_type_id`) ON UPDATE NO ACTION ON DELETE CASCADE 
);

CREATE INDEX `index_Score_user_id` ON `Score` (
	`user_id`
);

CREATE  INDEX `index_Score_puzzle_type_id` ON `Score` (
	`puzzle_type_id`
);

CREATE TABLE IF NOT EXISTS `${User}` (
	`user_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 
	`first_name` TEXT, 
	`last_name` TEXT
);