CREATE TABLE `Counters` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `count` int(11) NOT NULL DEFAULT '1',
  `createdAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8

// �û��� (User)
CREATE TABLE User (
    UserID INT AUTO_INCREMENT PRIMARY KEY,
    Username VARCHAR(100) NOT NULL,
    Avatar VARCHAR(255),
    OtherInfo TEXT, -- ���ڴ洢�����û������Ϣ
    CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

// �˱��� (Ledger)
CREATE TABLE Ledger (
    LedgerID INT AUTO_INCREMENT PRIMARY KEY,          -- �˱� ID
    CreatorID INT NOT NULL,                           -- �����ߵ��û� ID
    LedgerName VARCHAR(100) NOT NULL,                 -- �˱�����
    MemberCount INT DEFAULT 0,                        -- ��Ա�����������ֶΣ�
    RecordCount INT DEFAULT 0,                        -- ���Ѽ�¼��
    TotalExpense DECIMAL(10, 2) DEFAULT 0.00,         -- �����ѽ��
    CreationTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- ����ʱ��
    FOREIGN KEY (CreatorID) REFERENCES User(UserID) ON DELETE CASCADE
);

// �˱������߱� (LedgerParticipant)
CREATE TABLE LedgerParticipant (
    ParticipantID INT AUTO_INCREMENT PRIMARY KEY,    -- ���������� ID
    LedgerID INT NOT NULL,                           -- �������˱� ID
    UserID INT NOT NULL,                             -- �������û� ID
    Role ENUM('creator', 'editor') DEFAULT 'editor', -- �û����˱��еĽ�ɫ
    isCreator BOOLEAN DEFAULT 0,                    -- �Ƿ�Ϊ�����ߣ������ֶΣ�
    FOREIGN KEY (LedgerID) REFERENCES Ledger(LedgerID) ON DELETE CASCADE,
    FOREIGN KEY (UserID) REFERENCES User(UserID) ON DELETE CASCADE
);


// ���Ѽ�¼�� (ExpenseRecord)
CREATE TABLE ExpenseRecord (
    RecordID INT AUTO_INCREMENT PRIMARY KEY,
    LedgerID INT NOT NULL,
    RecorderID INT NOT NULL,
    Amount DECIMAL(10, 2) NOT NULL,
    SplitType ENUM('all', 'custom') NOT NULL, -- ȫ���˷�̯���Զ����̯
    ExpenseTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Category VARCHAR(100),
    FOREIGN KEY (LedgerID) REFERENCES Ledger(LedgerID) ON DELETE CASCADE,
    FOREIGN KEY (RecorderID) REFERENCES User(UserID) ON DELETE CASCADE
);

// �˱������� (LedgerRelationship)
CREATE TABLE LedgerRelationship (
    MainLedgerID INT NOT NULL,
    RelatedLedgerID INT NOT NULL,
    PRIMARY KEY (MainLedgerID, RelatedLedgerID),
    FOREIGN KEY (MainLedgerID) REFERENCES Ledger(LedgerID) ON DELETE CASCADE,
    FOREIGN KEY (RelatedLedgerID) REFERENCES Ledger(LedgerID) ON DELETE CASCADE
);

// ��̯��Ա�� (ExpenseShare)
CREATE TABLE ExpenseShare (
    ShareID INT AUTO_INCREMENT PRIMARY KEY, -- ��̯��¼��Ψһ��ʶ
    RecordID INT NOT NULL,                  -- ���������Ѽ�¼��ID
    UserID INT NOT NULL,                    -- �����̯���û�ID
    ShareAmount DECIMAL(10, 2) NOT NULL,    -- �û�ʵ�ʷ�̯�Ľ��
    FOREIGN KEY (RecordID) REFERENCES ExpenseRecord(RecordID) ON DELETE CASCADE,
    FOREIGN KEY (UserID) REFERENCES User(UserID) ON DELETE CASCADE
);

