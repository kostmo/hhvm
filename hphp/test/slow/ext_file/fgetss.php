<?hh


<<__EntryPoint>>
function main_fgetss() {
$tempfile = tempnam(sys_get_temp_dir(), 'vmextfiletest');

$f = fopen($tempfile, 'w');
fputs($f, "<html><head>testing</head><body> fgetss</body></html>\n");
fclose($f);

$f = fopen($tempfile, "r");
var_dump(fgetss($f));

unlink($tempfile);
}
