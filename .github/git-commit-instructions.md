# Quy tắc sử dụng Git cho dự án vivatrip

## 1. Quy tắc đặt tên branch
- Tên branch phải ngắn gọn, rõ nghĩa, dùng tiếng Anh hoặc tiếng Việt không dấu.
- Đặt theo định dạng: `feature/ten-chuc-nang`, `bugfix/ten-loi`, `hotfix/ten-loi-khan-cap`, `release/ten-phien-ban`.
- Ví dụ: `feature/user-login`, `bugfix/fix-user-update`, `release/v1.0.0`.

## 2. Commit message
- Viết commit message bằng tiếng Việt rõ ràng, ngắn gọn, nêu rõ mục đích.
- Cấu trúc: `[Loại] Nội dung thay đổi`
    - Loại: `Add`, `Update`, `Fix`, `Remove`, `Refactor`, `Docs`, ...
    - Ví dụ: `Add chức năng đăng nhập`, `Fix lỗi validate email`, `Update giao diện trang chủ`.
- Không commit code rác, code thử nghiệm, log debug.

## 3. Quy trình làm việc với Git
- Luôn tạo branch mới từ `develop` hoặc `main`.
- Không commit trực tiếp lên `main` (trừ trường hợp hotfix khẩn cấp).
- Merge vào `develop` qua Pull Request (PR), bắt buộc code review trước khi merge.
- PR phải mô tả rõ nội dung, ảnh chụp màn hình (nếu có), liên kết task (nếu có).
- Không merge khi chưa được approve.

## 4. Quy tắc rebase/merge
- Ưu tiên rebase branch cá nhân với `develop` trước khi tạo PR để giảm xung đột.
- Nếu có xung đột, phải tự xử lý và test lại trước khi merge.

## 5. Tag & Release
- Đánh tag cho mỗi lần release, đặt tên theo định dạng: `vX.Y.Z` (ví dụ: v1.0.0).
- Ghi chú release rõ ràng, liệt kê các thay đổi chính.

## 6. Quy tắc khác
- Không push file cấu hình cá nhân, file build, thư mục `target/`, `node_modules/`, ... lên repo.
- Sử dụng `.gitignore` để loại trừ các file/thư mục không cần thiết.
- Không push thông tin nhạy cảm (password, token, key, ...).

---
**Lưu ý:**
- Luôn tuân thủ quy tắc này để đảm bảo lịch sử code sạch, dễ kiểm soát và bảo trì.
- Có thể bổ sung thêm rule nếu cần thiết để phù hợp thực tế dự án.

