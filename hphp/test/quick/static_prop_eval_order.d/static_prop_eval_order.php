<?hh
function f() {
  echo '1 ';
  return 0;
}
function g() {
  echo '2 ';
  return 0;
}
<<__EntryPoint>>
function entrypoint_static_prop_eval_order(): void {
  $x = 1;

  $cls = 'C';
  $cls::$x[0][f()] = g();
  echo "\n";
}
