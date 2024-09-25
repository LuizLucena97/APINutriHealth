ALTER TABLE nh_posts
ADD COLUMN user_id BIGINT;

ALTER TABLE nh_posts
ADD CONSTRAINT fk_user
FOREIGN KEY (user_id) REFERENCES nh_users(id);