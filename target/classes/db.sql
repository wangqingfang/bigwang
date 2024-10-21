CREATE TABLE `Counters` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `count` int(11) NOT NULL DEFAULT '1',
  `createdAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8

// 用户表 (User)
CREATE TABLE User (
    UserID INT AUTO_INCREMENT PRIMARY KEY,
    Username VARCHAR(100) NOT NULL,
    Avatar VARCHAR(255),
    OtherInfo TEXT, -- 用于存储其他用户相关信息
    CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

// 账本表 (Ledger)
CREATE TABLE Ledger (
    LedgerID INT AUTO_INCREMENT PRIMARY KEY,
    CreatorID INT NOT NULL,
    LedgerName VARCHAR(100) NOT NULL,
    CreationTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    RecordCount INT DEFAULT 0,
    TotalExpense DECIMAL(10, 2) DEFAULT 0.00,
    FOREIGN KEY (CreatorID) REFERENCES User(UserID) ON DELETE CASCADE
);

// 账本参与者表 (LedgerParticipant)
CREATE TABLE LedgerParticipant (
    ParticipantID INT AUTO_INCREMENT PRIMARY KEY,
    LedgerID INT NOT NULL,
    UserID INT NOT NULL,
    Role ENUM('creator', 'editor') DEFAULT 'editor', -- 创建者或编辑者角色
    FOREIGN KEY (LedgerID) REFERENCES Ledger(LedgerID) ON DELETE CASCADE,
    FOREIGN KEY (UserID) REFERENCES User(UserID) ON DELETE CASCADE
);

// 消费记录表 (ExpenseRecord)
CREATE TABLE ExpenseRecord (
    RecordID INT AUTO_INCREMENT PRIMARY KEY,
    LedgerID INT NOT NULL,
    RecorderID INT NOT NULL,
    Amount DECIMAL(10, 2) NOT NULL,
    SplitType ENUM('all', 'custom') NOT NULL, -- 全部人分摊或自定义分摊
    ExpenseTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Category VARCHAR(100),
    FOREIGN KEY (LedgerID) REFERENCES Ledger(LedgerID) ON DELETE CASCADE,
    FOREIGN KEY (RecorderID) REFERENCES User(UserID) ON DELETE CASCADE
);

// 账本关联表 (LedgerRelationship)
CREATE TABLE LedgerRelationship (
    MainLedgerID INT NOT NULL,
    RelatedLedgerID INT NOT NULL,
    PRIMARY KEY (MainLedgerID, RelatedLedgerID),
    FOREIGN KEY (MainLedgerID) REFERENCES Ledger(LedgerID) ON DELETE CASCADE,
    FOREIGN KEY (RelatedLedgerID) REFERENCES Ledger(LedgerID) ON DELETE CASCADE
);

// 分摊人员表 (ExpenseShare)
CREATE TABLE ExpenseShare (
    ShareID INT AUTO_INCREMENT PRIMARY KEY, -- 分摊记录的唯一标识
    RecordID INT NOT NULL,                  -- 关联到消费记录的ID
    UserID INT NOT NULL,                    -- 参与分摊的用户ID
    ShareAmount DECIMAL(10, 2) NOT NULL,    -- 用户实际分摊的金额
    FOREIGN KEY (RecordID) REFERENCES ExpenseRecord(RecordID) ON DELETE CASCADE,
    FOREIGN KEY (UserID) REFERENCES User(UserID) ON DELETE CASCADE
);

